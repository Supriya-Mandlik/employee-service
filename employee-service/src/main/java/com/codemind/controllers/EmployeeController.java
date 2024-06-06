package com.codemind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/employee")
	public String getEmployee() {
		
		// return the address data along with employee data
		
		// get the address data by hitting this - http://localhost:8080/address
		
		String address = restTemplate.getForObject("http://localhost:8080/address", String.class);
		//we autowire restTemplate to make a call to address url
		// String.class beacause we are getting data of type string
		
		return " Name : Abhilash , email : abhilash@gmail.com , "+address;
	}

}
