package com.nttdata.codegen.api;

import com.nttdata.codegen.model.Company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
@Controller
@RequestMapping("${openapi.servicioDeGestinBancaria.base-path:/api/v1}")
public class CompanyApiController implements CompanyApi {

    private final CompanyApiDelegate delegate;

    public CompanyApiController(@Autowired(required = false) CompanyApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CompanyApiDelegate() {});
    }

    @Override
    public CompanyApiDelegate getDelegate() {
        return delegate;
    }

}
