package com.wipro.jwtdemo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/Time")
    public String getCurrentTime() {
        return "Current time: " + LocalDateTime.now();
    }
	
	@RequestMapping("hello")
	public String helloWorld() {
		return "Hello world";
	}
	
	@RequestMapping("newhello")
	public String helloWorldNew(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello -New "+name+"!!";
	}
	
}
