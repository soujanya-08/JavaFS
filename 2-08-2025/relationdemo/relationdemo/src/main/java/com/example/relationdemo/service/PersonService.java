package com.example.relationdemo.service;
import java.util.List;

import com.example.relationdemo.entity.Person;

public interface PersonService {
	void save(Person p);
	List<Person> findAll();

}