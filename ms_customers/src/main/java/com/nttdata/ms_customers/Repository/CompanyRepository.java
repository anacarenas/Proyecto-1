package com.nttdata.ms_customers.Repository;

import com.nttdata.ms_customers.model.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CompanyRepository extends ReactiveMongoRepository<Company, Long> {

}
