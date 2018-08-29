package com.Coder.coderApp.components;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Coder.coderApp.entities.Customer;
import com.Coder.coderApp.repos.CustomerRepository;
import com.github.javafaker.Faker;




@Component
public class Seed {

	@Autowired
	CustomerRepository customers;


	@PostConstruct
	public void seed() {
        System.out.println("the Seeding Bean .... Start");
		//creating the feaker and list of entities
		Faker faker = new Faker();
		List<Customer> fakedCustomers = new ArrayList<Customer>();
		
		//creating 'customers'
		for (int i = 0; i < 3; i++) {
			Customer obj = new Customer(faker.name().firstName(), faker.name().lastName());
			fakedCustomers.add(obj);
		}
		
		//Adding 'customers' to the data base
		customers.saveAll(fakedCustomers);
		System.out.println("the Seeding Bean .... END");
	}
}