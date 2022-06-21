package com.ps.demo.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.demo.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
    List<Customer> findByFirstname(String firstname);
    
}
