package com.nttdata.ms_credits.api;

import com.nttdata.ms_credits.model.Company;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CompanyApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T20:04:37.520989500-05:00[America/Bogota]")
public interface CompanyApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /company : Obtener lista de empresas (Company)
     * Retorna una lista de todas las empresas registradas.
     *
     * @return Lista de empresas obtenida exitosamente (status code 200)
     * @see CompanyApi#companyGet
     */
    default Mono<ResponseEntity<Void>> companyGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * DELETE /company/{id} : Eliminar una empresa (Company)
     * Permite eliminar una empresa según su ID.
     *
     * @param id  (required)
     * @return Empresa eliminada exitosamente (status code 204)
     *         or Empresa no encontrada (status code 404)
     * @see CompanyApi#companyIdDelete
     */
    default Mono<ResponseEntity<Void>> companyIdDelete(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /company/{id} : Obtener detalles de una empresa (Company) por ID
     * Retorna los detalles de una empresa específica según su ID.
     *
     * @param id  (required)
     * @return Detalles de la empresa obtenidos exitosamente (status code 200)
     *         or Empresa no encontrada (status code 404)
     * @see CompanyApi#companyIdGet
     */
    default Mono<ResponseEntity<Void>> companyIdGet(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * PUT /company/{id} : Actualizar una empresa (Company) existente
     * Permite actualizar los detalles de una empresa existente.
     *
     * @param id  (required)
     * @param company  (required)
     * @return Empresa actualizada exitosamente (status code 200)
     *         or Solicitud incorrecta (status code 400)
     *         or Empresa no encontrada (status code 404)
     * @see CompanyApi#companyIdPut
     */
    default Mono<ResponseEntity<Void>> companyIdPut(Long id,
        Mono<Company> company,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(company).then(Mono.empty());

    }

    /**
     * POST /company : Crear una nueva empresa (Company)
     * Permite registrar una nueva empresa en el sistema.
     *
     * @param company  (required)
     * @return Empresa creada exitosamente (status code 201)
     *         or Solicitud incorrecta (status code 400)
     * @see CompanyApi#companyPost
     */
    default Mono<ResponseEntity<Void>> companyPost(Mono<Company> company,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(company).then(Mono.empty());

    }

}
