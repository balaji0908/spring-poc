package com.demo.history.model;

import java.util.List;

import com.demo.history.entity.Company;

import lombok.Data;

@Data
public class CompanyBo {

	private List<Company> companies;
}
