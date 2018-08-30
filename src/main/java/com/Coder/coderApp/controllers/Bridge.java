package com.Coder.coderApp.controllers;

import java.util.Date;
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
	
	@GetMapping("/")
	public ModelAndView welcome() {
		System.out.println("-----------------> calling /");
		ModelAndView m = new ModelAndView("index");
		System.out.println("-----------------> calling /getAll  ||  " + m.getViewName());
		return m;
	}
    
    @GetMapping(value="/getAll")
   	public ModelAndView getAll() {
    	System.out.println("-----------------> calling /getAll");
    	List<Customer> listUsers = customers.findAll();
    	ModelAndView m = new ModelAndView("users");
    	m.addObject("users",listUsers);
   		return m;
   	}

}