package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.demo.history.repository"})
@PropertySource("classpath:database.properties")
@EntityScan( basePackages = {"com.demo.history.entity"} )
public class JpaAuditingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAuditingApplication.class, args);
	}

}
