package com.pvlpech.repository;

import com.pvlpech.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EmployeeRepository extends CrudRepository<Employee, BigInteger> {

    List<Employee> findByFirstName(String firstName);
    //TODO jpa namedquery example

}
