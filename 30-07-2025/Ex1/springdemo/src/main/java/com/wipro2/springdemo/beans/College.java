package com.wipro2.springdemo.beans;

public class College {
	String clgName;
	Department dept;
	public String getClgName() {
		return clgName;
	}
	public College(String clgName, Department dept) {
		super();
		this.clgName = clgName;
		this.dept = dept;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "College [clgName=" + clgName + ", dept=" + dept + "]";
	}
	

}
