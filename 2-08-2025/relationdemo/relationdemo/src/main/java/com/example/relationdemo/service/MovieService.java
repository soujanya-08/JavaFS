package com.example.relationdemo.service;

import java.util.List;

import com.example.relationdemo.entity.Movie;

public interface MovieService {
	void save(Movie movie);
	List<Movie> findAll();

}
