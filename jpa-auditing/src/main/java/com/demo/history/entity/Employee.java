package com.demo.history.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Data;


@Entity
@Table(name = "employee")
@Data
@Audited
public class Employee  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6425260775733603340L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	//@Size(min=5, max=30)
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "company")
	private String company;
	
	@ManyToOne
	@JoinColumn(name="company_id", nullable = false, updatable = false, insertable = true)
	private Company companyId;

}
