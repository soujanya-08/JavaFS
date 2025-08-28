package com.wipro.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/Greet")
	String Greet() {
		return "Hello from Greet";
	}
	@GetMapping("/hello")
	String Hello() {
		return "Hello page";
	}
	@GetMapping("/")
	String Hello1() {
		return "main page";
	}
	

}
