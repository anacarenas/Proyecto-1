package com.nttdata.codegen.api;

import com.nttdata.codegen.model.CreditCard;
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
 * A delegate to be called by the {@link CreditcardApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
public interface CreditcardApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /creditcard : Obtener lista de tarjetas de crédito
     * Retorna una lista de todas las tarjetas de crédito registradas.
     *
     * @return Lista de tarjetas de crédito obtenida exitosamente (status code 200)
     * @see CreditcardApi#creditcardGet
     */
    default Mono<ResponseEntity<Void>> creditcardGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * DELETE /creditcard/{id} : Eliminar una tarjeta de crédito
     * Permite eliminar una tarjeta de crédito existente del sistema.
     *
     * @param id ID único de la tarjeta de crédito (required)
     * @return Tarjeta de crédito eliminada exitosamente (status code 204)
     * @see CreditcardApi#creditcardIdDelete
     */
    default Mono<ResponseEntity<Void>> creditcardIdDelete(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /creditcard/{id} : Obtener detalles de una tarjeta de crédito por ID
     * Retorna los detalles de una tarjeta de crédito específica según su ID.
     *
     * @param id ID único de la tarjeta de crédito (required)
     * @return Detalles de la tarjeta de crédito obtenidos exitosamente (status code 200)
     * @see CreditcardApi#creditcardIdGet
     */
    default Mono<ResponseEntity<Void>> creditcardIdGet(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * PUT /creditcard/{id} : Actualizar una tarjeta de crédito existente
     * Permite actualizar la información de una tarjeta de crédito existente en el sistema.
     *
     * @param id ID único de la tarjeta de crédito (required)
     * @param creditCard  (required)
     * @return Tarjeta de crédito actualizada exitosamente (status code 200)
     *         or Solicitud incorrecta (status code 400)
     * @see CreditcardApi#creditcardIdPut
     */
    default Mono<ResponseEntity<Void>> creditcardIdPut(Long id,
        Mono<CreditCard> creditCard,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(creditCard).then(Mono.empty());

    }

    /**
     * POST /creditcard : Crear una nueva tarjeta de crédito
     * Permite registrar una nueva tarjeta de crédito en el sistema.
     *
     * @param creditCard  (required)
     * @return Tarjeta de crédito creada exitosamente (status code 201)
     *         or Solicitud incorrecta (status code 400)
     * @see CreditcardApi#creditcardPost
     */
    default Mono<ResponseEntity<Void>> creditcardPost(Mono<CreditCard> creditCard,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(creditCard).then(Mono.empty());

    }

}
