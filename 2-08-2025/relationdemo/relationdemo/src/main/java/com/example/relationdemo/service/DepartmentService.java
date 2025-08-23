package com.example.relationdemo.service;

import java.util.List;

import com.example.relationdemo.entity.Department;

public interface DepartmentService {
	void save(Department dept);
	List<Department> findAll();
}
