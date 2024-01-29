package com.nttdata.ms_customers.api;

import com.nttdata.ms_customers.Repository.CompanyRepository;
import com.nttdata.ms_customers.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CompanyApiDelegateImpl implements CompanyApiDelegate {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyApiDelegateImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Mono<ResponseEntity<?>> companyGet(ServerWebExchange exchange) {
        return companyRepository.findAll()
                .collectList()
                .flatMap(companies -> {
                    if(companies.isEmpty()){
                        return Mono.just(ResponseEntity.notFound().build());
                    }
                    else {
                        return Mono.just(ResponseEntity.ok().body(companies.stream()));
                    }
                })
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));


    }

    @Override
    public Mono<ResponseEntity<Object>> companyIdDelete(Long id, ServerWebExchange exchange) {
        return companyRepository.findById(id)
                .flatMap(company -> {
                    companyRepository.delete(company);
                    return Mono.just(ResponseEntity.noContent().build());
                })
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<Object>> companyIdGet(Long id, ServerWebExchange exchange) {
        return companyRepository.findById(id)
                .map(company -> ResponseEntity.ok().build())
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<Object>> companyIdPut(Long id, Mono<Company> companyMono, ServerWebExchange exchange) {
        return companyMono
                .flatMap(updatedCompany -> companyRepository.findById(id)
                .flatMap(existingCompany -> {
                    // Actualizamos los datos que de la companiia
                    existingCompany.setCompanyName(updatedCompany.getCompanyName());
                    existingCompany.setRuc(updatedCompany.getRuc());
                    existingCompany.setEmail(updatedCompany.getEmail());
                    existingCompany.setTelephone(updatedCompany.getTelephone());
                    existingCompany.setHeadlines(updatedCompany.getHeadlines());
                    existingCompany.setSignatories(updatedCompany.getSignatories());
                    existingCompany.setTypeProfile(updatedCompany.getTypeProfile());

                    // Guardamos el actualizado
                    return companyRepository.save(existingCompany);
                })
        )
                .map(updated -> ResponseEntity.ok().build())
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<Void>> companyPost(Mono<Company> companyMono, ServerWebExchange exchange) {
        return companyMono
                .flatMap(newCompany -> {
                    // Se crea un nuevo documento
                    return companyRepository.save(newCompany)
                            .map(savedCompany -> ResponseEntity.status(HttpStatus.CREATED).build());
                });
    }
}