package com.Coder.coderApp.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Coder.coderApp.entities.Customer;
import com.Coder.coderApp.repos.CustomerRepository;


 
@RestController    
public class Bridge{
	
	@Autowired
	CustomerRepository customers;
	
	
    @GetMapping(value="/Hi")
	public String Hi() {
		return "Hello .... all works";
	}
    
    @GetMapping(value="/getAll")
   	public List<Customer> getAll() {
   		return customers.findAll();
   	}
}