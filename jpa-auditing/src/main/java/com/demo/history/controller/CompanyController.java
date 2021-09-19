package com.demo.history.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.history.entity.Company;
import com.demo.history.model.CompanyBo;
import com.demo.history.repository.CompanyRepository;

@RestController
public class CompanyController {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@RequestMapping(value = "/companies", method = RequestMethod.GET)
	public List<Company> getAll() {
		return companyRepository.findAll();
	}
	
	@RequestMapping(value = "/deleteAndInsert", method = RequestMethod.POST)
	public List<Company> updatePerson(@RequestBody CompanyBo companyBo) {
		companyRepository.deleteAll();
		//companyRepository.delete(14L);
		
		return companyRepository.save(companyBo.getCompanies());
	}

}
