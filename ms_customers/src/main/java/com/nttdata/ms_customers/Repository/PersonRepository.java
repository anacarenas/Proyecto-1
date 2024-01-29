package com.nttdata.ms_customers.Repository;

import com.nttdata.ms_customers.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PersonRepository extends ReactiveMongoRepository<Person, Long> {
}
