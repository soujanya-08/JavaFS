package com.wipro.carms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.carms.entity.Car;
import com.wipro.carms.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	CarService carService;
	
	@PostMapping
	void save(@RequestBody Car c) {
		carService.save(c);
	}
	@PutMapping
	void update(@RequestBody Car c) {
		carService.save(c);
	}
	 
	@GetMapping
	ResponseEntity<List<Car>> findAll(){
		return ResponseEntity.ok().body(carService.findAll());
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<?> delete(@PathVariable int id){
		carService.deleteById(id);
		return ResponseEntity.ok("Deleted successfully");
	}
	
}
