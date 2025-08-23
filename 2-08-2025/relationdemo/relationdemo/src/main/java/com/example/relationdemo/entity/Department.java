package com.example.relationdemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="department")
@Data
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="dept_id")
	int id;
	
	@Column(name="dept_name")
	String deptName;

	@OneToOne(mappedBy="department")
	@JsonBackReference
	Employee emp;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + "]";
	}
	
	
}
