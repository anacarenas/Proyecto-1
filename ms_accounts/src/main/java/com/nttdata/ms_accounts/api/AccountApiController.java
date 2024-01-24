package com.nttdata.ms_accounts.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T08:30:55.149919600-05:00[America/Bogota]")
@Controller
@RequestMapping("${openapi.accountsMicroservice.base-path:/api/v1}")
public class AccountApiController implements AccountApi {

    private final AccountApiDelegate delegate;

    public AccountApiController(@Autowired(required = false) AccountApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AccountApiDelegate() {});
    }

    @Override
    public AccountApiDelegate getDelegate() {
        return delegate;
    }

}
