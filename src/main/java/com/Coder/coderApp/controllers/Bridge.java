package com.Coder.coderApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Coder.coderApp.entities.Customer;
import com.Coder.coderApp.repos.CustomerRepository;


 
@RestController    
public class Bridge{
	
	@Autowired
	CustomerRepository customers;
	
	
    @GetMapping(value="/")
	public ModelAndView  index() {
    	ModelAndView m = new ModelAndView("index"); 
		return m;
	}
    
    @GetMapping(value="/getAll")
   	public List<Customer> getAll() {
   		return customers.findAll();
   	}
}