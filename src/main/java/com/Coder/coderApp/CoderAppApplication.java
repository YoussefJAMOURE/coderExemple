package com.Coder.coderApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.Coder.coderApp.repos" })
@EntityScan(basePackages = { "com.Coder.coderApp.entities" })
@ComponentScan({"com.Coder.coderApp.components","com.Coder.coderApp.controllers"})
public class CoderAppApplication extends SpringBootServletInitializer{

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(CoderAppApplication.class);
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(CoderAppApplication.class, args);
	    }
}
