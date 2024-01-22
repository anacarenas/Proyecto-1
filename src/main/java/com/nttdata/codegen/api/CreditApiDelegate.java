package com.nttdata.codegen.api;

import com.nttdata.codegen.model.Credit;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link CreditApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
public interface CreditApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /credit : Obtener lista de créditos
     * Retorna una lista de todos los créditos registrados.
     *
     * @return Lista de créditos obtenida exitosamente (status code 200)
     * @see CreditApi#creditGet
     */
    default Mono<ResponseEntity<Void>> creditGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * DELETE /credit/{id} : Eliminar un crédito
     * Permite eliminar un crédito existente del sistema.
     *
     * @param id ID único del crédito (required)
     * @return Crédito eliminado exitosamente (status code 204)
     * @see CreditApi#creditIdDelete
     */
    default Mono<ResponseEntity<Void>> creditIdDelete(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /credit/{id} : Obtener detalles de un crédito por ID
     * Retorna los detalles de un crédito específico según su ID.
     *
     * @param id ID único del crédito (required)
     * @return Detalles del crédito obtenidos exitosamente (status code 200)
     * @see CreditApi#creditIdGet
     */
    default Mono<ResponseEntity<Void>> creditIdGet(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * PUT /credit/{id} : Actualizar un crédito existente
     * Permite actualizar la información de un crédito existente en el sistema.
     *
     * @param id ID único del crédito (required)
     * @param credit  (required)
     * @return Crédito actualizado exitosamente (status code 200)
     *         or Solicitud incorrecta (status code 400)
     * @see CreditApi#creditIdPut
     */
    default Mono<ResponseEntity<Void>> creditIdPut(Long id,
        Mono<Credit> credit,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(credit).then(Mono.empty());

    }

    /**
     * POST /credit : Crear un nuevo crédito
     * Permite registrar un nuevo crédito en el sistema.
     *
     * @param credit  (required)
     * @return Crédito creado exitosamente (status code 201)
     *         or Solicitud incorrecta (status code 400)
     * @see CreditApi#creditPost
     */
    default Mono<ResponseEntity<Void>> creditPost(Mono<Credit> credit,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(credit).then(Mono.empty());

    }

}
