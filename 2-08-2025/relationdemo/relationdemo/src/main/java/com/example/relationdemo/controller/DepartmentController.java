package com.example.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationdemo.entity.Department;
import com.example.relationdemo.service.DepartmentService;

import lombok.Data;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	DepartmentService deptService;
	
	@GetMapping()
	List<Department> findAll(){
		return deptService.findAll();
	}
	@PostMapping()
	void save(@RequestBody Department dept) {
		deptService.save(dept);
	}
	
}
