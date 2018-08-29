package com.Coder.coderApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.Coder.coderApp.repos " })
@EntityScan(basePackages = { "com.Coder.coderApp.entities" })
@ComponentScan("com.Coder.coderApp.components")
public class CoderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoderAppApplication.class, args);
	}
}
