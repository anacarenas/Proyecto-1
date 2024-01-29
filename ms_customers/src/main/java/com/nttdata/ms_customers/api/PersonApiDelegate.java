package com.nttdata.ms_customers.api;

import com.nttdata.ms_customers.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PersonApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T20:04:37.520989500-05:00[America/Bogota]")
public interface PersonApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /person : Obtener lista de personas (Person)
     * Retorna una lista de todas las personas registradas.
     *
     * @return Lista de personas obtenida exitosamente (status code 200)
     * @see PersonApi#personGet
     */
    default Mono<ResponseEntity<?>> personGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * DELETE /person/{id} : Eliminar una persona (Person)
     * Permite eliminar una persona según su ID.
     *
     * @param id  (required)
     * @return Persona eliminada exitosamente (status code 204)
     *         or Persona no encontrada (status code 404)
     * @see PersonApi#personIdDelete
     */
    default Mono<ResponseEntity<Object>> personIdDelete(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /person/{id} : Obtener detalles de una persona (Person) por ID
     * Retorna los detalles de una persona específica según su ID.
     *
     * @param id  (required)
     * @return Detalles de la persona obtenidos exitosamente (status code 200)
     *         or Persona no encontrada (status code 404)
     * @see PersonApi#personIdGet
     */
    default Mono<ResponseEntity<Object>> personIdGet(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * PUT /person/{id} : Actualizar una persona (Person) existente
     * Permite actualizar los detalles de una persona existente.
     *
     * @param id  (required)
     * @param person  (required)
     * @return Persona actualizada exitosamente (status code 200)
     *         or Solicitud incorrecta (status code 400)
     *         or Persona no encontrada (status code 404)
     * @see PersonApi#personIdPut
     */
    default Mono<ResponseEntity<Object>> personIdPut(Long id,
        Mono<Person> person,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(person).then(Mono.empty());

    }

    /**
     * POST /person : Crear una nueva persona (Person)
     * Permite registrar una nueva persona en el sistema.
     *
     * @param person  (required)
     * @return Persona creada exitosamente (status code 201)
     *         or Solicitud incorrecta (status code 400)
     * @see PersonApi#personPost
     */
    default Mono<ResponseEntity<Void>> personPost(Mono<Person> person,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(person).then(Mono.empty());

    }

}
