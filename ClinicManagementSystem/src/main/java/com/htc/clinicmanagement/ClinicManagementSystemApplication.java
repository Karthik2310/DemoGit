package com.htc.clinicmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ClinicManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicManagementSystemApplication.class, args);
	}

}
