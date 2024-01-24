package com.nttdata.ms_transactions.api;

import com.nttdata.ms_transactions.model.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TransactionApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T21:00:26.717960800-05:00[America/Bogota]")
public interface TransactionApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /transaction : Obtener lista de transacciones
     * Retorna una lista de todas las transacciones registradas.
     *
     * @return Lista de transacciones obtenida exitosamente (status code 200)
     * @see TransactionApi#transactionGet
     */
    default Mono<ResponseEntity<Void>> transactionGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * DELETE /transaction/{id} : Eliminar una transacción
     * Permite eliminar una transacción según su ID.
     *
     * @param id  (required)
     * @return Transacción eliminada exitosamente (status code 204)
     *         or Transacción no encontrada (status code 404)
     * @see TransactionApi#transactionIdDelete
     */
    default Mono<ResponseEntity<Void>> transactionIdDelete(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /transaction/{id} : Obtener detalles de una transacción por ID
     * Retorna los detalles de una transacción específica según su ID.
     *
     * @param id  (required)
     * @return Detalles de la transacción obtenidos exitosamente (status code 200)
     *         or Transacción no encontrada (status code 404)
     * @see TransactionApi#transactionIdGet
     */
    default Mono<ResponseEntity<Void>> transactionIdGet(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * PUT /transaction/{id} : Actualizar una transacción existente
     * Permite actualizar los detalles de una transacción existente.
     *
     * @param id  (required)
     * @param transaction  (required)
     * @return Transacción actualizada exitosamente (status code 200)
     *         or Solicitud incorrecta (status code 400)
     *         or Transacción no encontrada (status code 404)
     * @see TransactionApi#transactionIdPut
     */
    default Mono<ResponseEntity<Void>> transactionIdPut(Long id,
        Mono<Transaction> transaction,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(transaction).then(Mono.empty());

    }

    /**
     * POST /transaction : Crear una nueva transacción
     * Permite registrar una nueva transacción en el sistema.
     *
     * @param transaction  (required)
     * @return Transacción creada exitosamente (status code 201)
     *         or Solicitud incorrecta (status code 400)
     * @see TransactionApi#transactionPost
     */
    default Mono<ResponseEntity<Void>> transactionPost(Mono<Transaction> transaction,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(transaction).then(Mono.empty());

    }

}
