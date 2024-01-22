package com.nttdata.codegen.api;

import com.nttdata.codegen.model.Account;
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
 * A delegate to be called by the {@link AccountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
public interface AccountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /account : Obtener lista de cuentas (Account)
     * Retorna una lista de todas las cuentas registradas.
     *
     * @return Lista de cuentas obtenida exitosamente (status code 200)
     * @see AccountApi#accountGet
     */
    default Mono<ResponseEntity<Void>> accountGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * DELETE /account/{id} : Eliminar una cuenta (Account)
     * Permite eliminar una cuenta según su ID.
     *
     * @param id  (required)
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
     * GET /account/{id} : Obtener detalles de una cuenta (Account) por ID
     * Retorna los detalles de una cuenta específica según su ID.
     *
     * @param id  (required)
     * @return Detalles de la cuenta obtenidos exitosamente (status code 200)
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
     * PUT /account/{id} : Actualizar una cuenta (Account) existente
     * Permite actualizar los detalles de una cuenta existente.
     *
     * @param id  (required)
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
     * POST /account : Crear una nueva cuenta (Account)
     * Permite registrar una nueva cuenta en el sistema.
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
