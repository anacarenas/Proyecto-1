package com.nttdata.ms_customers.model;

import lombok.Data;
@Data
public class PersonDto {

    private Long id;
    private String name;
    private String lastName;
    private Integer dni;
    private String email;
    private Integer telephone;
    private String typeCustomer;
    private String typeProfile;
}