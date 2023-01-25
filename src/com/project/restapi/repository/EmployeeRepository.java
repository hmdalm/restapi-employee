package com.project.restapi.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.restapi.model.Employee;

@Repository
@Configuration
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
