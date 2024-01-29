package com.nttdata.ms_customers.api;
import com.nttdata.ms_customers.Repository.PersonRepository;
import com.nttdata.ms_customers.model.Person;
import com.nttdata.ms_customers.model.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonApiDelegateImpl implements PersonApiDelegate {

    private final PersonRepository personRepository;

    @Autowired
    public PersonApiDelegateImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Mono<ResponseEntity<?>> personGet(ServerWebExchange exchange) {
        return personRepository.findAll()
                .collectList()
                .flatMap(persons -> {
                    if (!persons.isEmpty()) {
                        // Cambiar el formato al Dto
                        List<PersonDto> personResponseList = persons.stream()
                                .map(this::mapToResponseDto)
                                .collect(Collectors.toList());

                        // Respuesta correcta con la lista de
                        return Mono.just(ResponseEntity.ok().body(personResponseList));
                    } else {
                        // Retornar codigo de respueste de no se hallaron resultadso
                        return Mono.just(ResponseEntity.notFound().build());
                    }
                })
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));

    }

    @Override
    public Mono<ResponseEntity<Object>> personIdDelete(Long id, ServerWebExchange exchange) {
        return personRepository.findById(id)
                .flatMap(person -> {
                    personRepository.delete(person);
                    return Mono.just(ResponseEntity.noContent().build());
                })
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<Object>> personIdGet(Long id, ServerWebExchange exchange) {
        return personRepository.findById(id)
                .map(person -> ResponseEntity.ok().build())
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<Object>> personIdPut(Long id, Mono<Person> personMono, ServerWebExchange exchange) {
        return personMono
                .flatMap(updatedPerson -> personRepository.findById(id)
                        .flatMap(existingPerson -> {
                            // Se actualizan los datos miembro de Persona
                            existingPerson.setName(updatedPerson.getName());
                            existingPerson.setLastName(updatedPerson.getLastName());
                            existingPerson.setDni(updatedPerson.getDni());
                            existingPerson.setEmail(updatedPerson.getEmail());
                            existingPerson.setTelephone(updatedPerson.getTelephone());
                            existingPerson.setTypeCustomer(updatedPerson.getTypeCustomer());
                            existingPerson.setTypeProfile(updatedPerson.getTypeProfile());

                            // Guardamos el actualizado
                            return personRepository.save(existingPerson);
                        })
                )
                .map(updated -> ResponseEntity.ok().build())
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<Void>> personPost(Mono<Person> personMono, ServerWebExchange exchange) {
        return personMono
                .flatMap(newPerson -> {
                    // Se crea un nuevo documento
                    return personRepository.save(newPerson)
                            .map(savedPerson -> ResponseEntity.status(HttpStatus.CREATED).build());
                });
    }
    private PersonDto mapToResponseDto(Person person) {
        PersonDto responseDto = new PersonDto();
        responseDto.setId(person.getId());
        responseDto.setName(person.getName());
        responseDto.setLastName(person.getLastName());
        responseDto.setDni(person.getDni());
        responseDto.setEmail(person.getEmail());
        responseDto.setTelephone(person.getTelephone());
        responseDto.setTypeCustomer(person.getTypeCustomer().name());
        responseDto.setTypeProfile(person.getTypeProfile().name());
        return responseDto;
    }
}