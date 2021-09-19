package com.demo.history.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.history.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
