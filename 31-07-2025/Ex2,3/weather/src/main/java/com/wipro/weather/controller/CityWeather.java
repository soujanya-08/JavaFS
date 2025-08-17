package com.wipro.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityWeather {
	
	@GetMapping("/weather")
	String getWeather(@RequestParam String city,@RequestParam String day ) {
		return "Weather in " + city +" "+ day + " is cloudy";
	}

}
