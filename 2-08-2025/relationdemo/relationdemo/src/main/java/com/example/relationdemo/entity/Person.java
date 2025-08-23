package com.example.relationdemo.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	
	@Column(name="name")
	String name;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	Set<Post> postList; 
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="person_id", referencedColumnName ="id")
	Set<Post> postList;

}
