package com.demo.history.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.history.entity.Company;
import com.demo.history.entity.Employee;
import com.demo.history.repository.CompanyRepository;
import com.demo.history.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
	
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public Employee updatePerson(@RequestBody Employee employee) {
		Company company = companyRepository.findOne(20L);
		employee.setCompanyId(company);
		return employeeRepository.save(employee);
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		Company company = companyRepository.findOne(20L);
		employee.setCompanyId(company);
		return employeeRepository.save(employee);
	}

}
