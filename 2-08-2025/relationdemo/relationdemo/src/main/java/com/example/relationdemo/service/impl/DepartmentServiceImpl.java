package com.example.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationdemo.entity.Department;
import com.example.relationdemo.repo.DepartmentRepo;
import com.example.relationdemo.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepo deptRepo;
	@Override
	public void save(Department dept) {
		deptRepo.save(dept);
	}

	@Override
	public List<Department> findAll() {
		return deptRepo.findAll();
	}

}
