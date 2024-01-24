package com.nttdata.ms_credits.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T20:04:37.520989500-05:00[America/Bogota]")
@Controller
@RequestMapping("${openapi.customersMicroservice.base-path:/api/v1}")
public class PersonApiController implements PersonApi {

    private final PersonApiDelegate delegate;

    public PersonApiController(@Autowired(required = false) PersonApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PersonApiDelegate() {});
    }

    @Override
    public PersonApiDelegate getDelegate() {
        return delegate;
    }

}
