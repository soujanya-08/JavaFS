package com.wipro.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getTemp {

	@GetMapping("/tocentigrade/{value}")
	int getCentigrade(@PathVariable int value) {
		return (value-32)*5/9;
	}
}
