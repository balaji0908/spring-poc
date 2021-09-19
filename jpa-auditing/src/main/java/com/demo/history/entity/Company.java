package com.demo.history.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Data;


@Entity
@Table(name = "company")
@Data
@Audited
public class Company  {

	private static final long serialVersionUID = 6425260775733603340L;

	/**Not sure where is just for post gres but just by mentioning IDENTITY it doesn't work
	 * During runtime it gives Null i.e COnstraint VIolation error
	 * while creating table create id with type as serial ,post gres by default creates as sequnce 
	 * for this column then only it works**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "country")
	private String country;
	

}
