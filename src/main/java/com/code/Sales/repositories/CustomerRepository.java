package com.code.Sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.Sales.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    Customer findCustomerByEmail(String email);
}
