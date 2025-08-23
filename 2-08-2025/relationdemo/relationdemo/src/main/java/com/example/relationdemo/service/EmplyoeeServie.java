package com.example.relationdemo.service;

import java.util.List;

import com.example.relationdemo.entity.Employee;

public interface EmplyoeeServie {
	void save(Employee emp);
	List<Employee> findAll();

}
