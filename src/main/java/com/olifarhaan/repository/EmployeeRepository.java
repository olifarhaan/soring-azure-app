package com.olifarhaan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.olifarhaan.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
