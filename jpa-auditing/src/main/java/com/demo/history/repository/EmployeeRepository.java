package com.demo.history.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.history.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
