package com.example.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationdemo.entity.Employee;
import com.example.relationdemo.service.EmplyoeeServie;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmplyoeeServie empService;
	
	@PostMapping
	void save(@RequestBody Employee emp)
	{
		System.out.print(emp);
		empService.save(emp);
		
	}
	
	@GetMapping
	List<Employee> findAll()
	{
		return empService.findAll();
		
	}
	
}
