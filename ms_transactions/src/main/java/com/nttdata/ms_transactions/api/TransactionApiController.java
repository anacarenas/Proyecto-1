package com.nttdata.ms_transactions.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T21:00:26.717960800-05:00[America/Bogota]")
@Controller
@RequestMapping("${openapi.transaccionsMicroservice.base-path:/api/v1}")
public class TransactionApiController implements TransactionApi {

    private final TransactionApiDelegate delegate;

    public TransactionApiController(@Autowired(required = false) TransactionApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TransactionApiDelegate() {});
    }

    @Override
    public TransactionApiDelegate getDelegate() {
        return delegate;
    }

}
