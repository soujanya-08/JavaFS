package com.example.relationdemo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationdemo.entity.Person;
import com.example.relationdemo.repo.PersonRepo;
import com.example.relationdemo.service.PersonService;

@Service
public class PersonServieImpl implements PersonService {

	@Autowired
	PersonRepo pRepo;
	@Override
	public void save(Person p) {
		pRepo.save(p);
	}

	@Override
	public List<Person> findAll() {	
		return pRepo.findAll();
	}


}