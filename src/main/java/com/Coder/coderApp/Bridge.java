package com.Coder.coderApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController    
public class Bridge{
    
    @GetMapping(value="/Hi")
	public String Hi() {
		return "Hello .... all works";
	}
}