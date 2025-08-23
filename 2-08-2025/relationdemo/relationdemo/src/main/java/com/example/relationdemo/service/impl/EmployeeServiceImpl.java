package com.example.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationdemo.entity.Employee;
import com.example.relationdemo.repo.EmployeeRepo;
import com.example.relationdemo.service.EmplyoeeServie;

@Service
public class EmployeeServiceImpl implements EmplyoeeServie {

	@Autowired
	EmployeeRepo empRepo;
	@Override
	public void save(Employee emp) {
		empRepo.save(emp);
	}

	@Override
	public List<Employee> findAll() {	
		return empRepo.findAll();
	}

}
