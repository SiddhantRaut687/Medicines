package com.medicines.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.medicines.dao")
@ComponentScan(basePackages = {"com.medicines.controller", "com.medicines.service"})
@EntityScan("com.medicines.model")
public class MedicinesApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MedicinesApplication.class, args);
	}

}
