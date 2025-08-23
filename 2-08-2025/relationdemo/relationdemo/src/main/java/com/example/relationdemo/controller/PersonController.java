package com.example.relationdemo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationdemo.entity.Person;
import com.example.relationdemo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService pService;
	
	@PostMapping
	void save(@RequestBody Person p)
	{
		System.out.print(p);
		pService.save(p);
		
	}
	
	@GetMapping
	List<Person> findAll()
	{
		return pService.findAll();
		
	}
	
}