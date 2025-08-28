package com.wipro.letsgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgo.entity.Vehicle;
import com.wipro.letsgo.service.VehicleService;

@RestController
public class VehicleController {
	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("/move")
	ResponseEntity<?> save(@RequestBody Vehicle v){
		vehicleService.save(v);
		return new ResponseEntity<>("Saved vehicle details", HttpStatus.CREATED);
	}

}
