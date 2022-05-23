package com.github.developermobile.citiesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class CitiesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesApiApplication.class, args);
	}

}
