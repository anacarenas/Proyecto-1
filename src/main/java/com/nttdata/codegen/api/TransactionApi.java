/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.nttdata.codegen.api;

import com.nttdata.codegen.model.Transaction;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
@Validated
@Tag(name = "transaction", description = "Operaciones relacionadas con transacciones")
public interface TransactionApi {

    default TransactionApiDelegate getDelegate() {
        return new TransactionApiDelegate() {};
    }

    /**
     * GET /transaction : Obtener lista de transacciones
     * Retorna una lista de todas las transacciones registradas.
     *
     * @return Lista de transacciones obtenida exitosamente (status code 200)
     */
    @Operation(
        operationId = "transactionGet",
        summary = "Obtener lista de transacciones",
        description = "Retorna una lista de todas las transacciones registradas.",
        tags = { "transaction" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de transacciones obtenida exitosamente")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/transaction",
        produces = { "application/json" }
    )
    default Mono<ResponseEntity<Void>> transactionGet(
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().transactionGet(exchange);
    }


    /**
     * DELETE /transaction/{id} : Eliminar una transacción
     * Permite eliminar una transacción según su ID.
     *
     * @param id  (required)
     * @return Transacción eliminada exitosamente (status code 204)
     *         or Transacción no encontrada (status code 404)
     */
    @Operation(
        operationId = "transactionIdDelete",
        summary = "Eliminar una transacción",
        description = "Permite eliminar una transacción según su ID.",
        tags = { "transaction" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Transacción eliminada exitosamente"),
            @ApiResponse(responseCode = "404", description = "Transacción no encontrada")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/transaction/{id}",
        produces = { "application/json" }
    )
    default Mono<ResponseEntity<Void>> transactionIdDelete(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().transactionIdDelete(id, exchange);
    }


    /**
     * GET /transaction/{id} : Obtener detalles de una transacción por ID
     * Retorna los detalles de una transacción específica según su ID.
     *
     * @param id  (required)
     * @return Detalles de la transacción obtenidos exitosamente (status code 200)
     *         or Transacción no encontrada (status code 404)
     */
    @Operation(
        operationId = "transactionIdGet",
        summary = "Obtener detalles de una transacción por ID",
        description = "Retorna los detalles de una transacción específica según su ID.",
        tags = { "transaction" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Detalles de la transacción obtenidos exitosamente"),
            @ApiResponse(responseCode = "404", description = "Transacción no encontrada")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/transaction/{id}",
        produces = { "application/json" }
    )
    default Mono<ResponseEntity<Void>> transactionIdGet(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().transactionIdGet(id, exchange);
    }


    /**
     * PUT /transaction/{id} : Actualizar una transacción existente
     * Permite actualizar los detalles de una transacción existente.
     *
     * @param id  (required)
     * @param Transaction  (required)
     * @return Transacción actualizada exitosamente (status code 200)
     *         or Solicitud incorrecta (status code 400)
     *         or Transacción no encontrada (status code 404)
     */
    @Operation(
        operationId = "transactionIdPut",
        summary = "Actualizar una transacción existente",
        description = "Permite actualizar los detalles de una transacción existente.",
        tags = { "transaction" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Transacción actualizada exitosamente"),
            @ApiResponse(responseCode = "400", description = "Solicitud incorrecta"),
            @ApiResponse(responseCode = "404", description = "Transacción no encontrada")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/transaction/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default Mono<ResponseEntity<Void>> transactionIdPut(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "Transaction", description = "", required = true) @Valid @RequestBody Mono<Transaction> Transaction,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().transactionIdPut(id, Transaction, exchange);
    }


    /**
     * POST /transaction : Crear una nueva transacción
     * Permite registrar una nueva transacción en el sistema.
     *
     * @param Transaction  (required)
     * @return Transacción creada exitosamente (status code 201)
     *         or Solicitud incorrecta (status code 400)
     */
    @Operation(
        operationId = "transactionPost",
        summary = "Crear una nueva transacción",
        description = "Permite registrar una nueva transacción en el sistema.",
        tags = { "transaction" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Transacción creada exitosamente"),
            @ApiResponse(responseCode = "400", description = "Solicitud incorrecta")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/transaction",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default Mono<ResponseEntity<Void>> transactionPost(
        @Parameter(name = "Transaction", description = "", required = true) @Valid @RequestBody Mono<Transaction> Transaction,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().transactionPost(Transaction, exchange);
    }

}