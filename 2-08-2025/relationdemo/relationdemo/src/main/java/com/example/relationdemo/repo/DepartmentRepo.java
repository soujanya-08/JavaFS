package com.example.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relationdemo.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
