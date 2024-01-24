package com.nttdata.ms_accounts.api;

import com.nttdata.ms_accounts.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;
import java.util.Optional;

/**
 * A delegate to be called by the {@link AccountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T08:30:55.149919600-05:00[America/Bogota]")
public interface AccountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /account : Obtener todas las cuentas
     *
     * @return Lista de todas las cuentas (status code 200)
     * @see AccountApi#accountGet
     */
    default Mono<ResponseEntity<Void>> accountGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * DELETE /account/{id} : Eliminar una cuenta
     *
     * @param id ID único de la cuenta (required)
     * @return Cuenta eliminada exitosamente (status code 204)
     *         or Cuenta no encontrada (status code 404)
     * @see AccountApi#accountIdDelete
     */
    default Mono<ResponseEntity<Void>> accountIdDelete(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /account/{id} : Obtener una cuenta por ID
     *
     * @param id ID único de la cuenta (required)
     * @return Detalles de la cuenta (status code 200)
     *         or Cuenta no encontrada (status code 404)
     * @see AccountApi#accountIdGet
     */
    default Mono<ResponseEntity<Void>> accountIdGet(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * PUT /account/{id} : Actualizar una cuenta existente
     *
     * @param id ID único de la cuenta (required)
     * @param account  (required)
     * @return Cuenta actualizada exitosamente (status code 200)
     *         or Solicitud incorrecta (status code 400)
     *         or Cuenta no encontrada (status code 404)
     * @see AccountApi#accountIdPut
     */
    default Mono<ResponseEntity<Void>> accountIdPut(Long id,
        Mono<Account> account,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(account).then(Mono.empty());

    }

    /**
     * POST /account : Crear una nueva cuenta
     *
     * @param account  (required)
     * @return Cuenta creada exitosamente (status code 201)
     *         or Solicitud incorrecta (status code 400)
     * @see AccountApi#accountPost
     */
    default Mono<ResponseEntity<Void>> accountPost(Mono<Account> account,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(account).then(Mono.empty());

    }

}
