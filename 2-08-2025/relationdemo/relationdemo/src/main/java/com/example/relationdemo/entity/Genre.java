package com.example.relationdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="genre")
public class Genre {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="genre_id")
	int id;
	
	@Column(name="description")
	String description;
}
	