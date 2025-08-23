package com.example.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationdemo.entity.Movie;
import com.example.relationdemo.repo.MovieRepo;
import com.example.relationdemo.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepo movieRepo;
	@Override
	public void save(Movie movie) {
		movieRepo.save(movie);
	}

	@Override
	public List<Movie> findAll() {
		
		return movieRepo.findAll();
	}

}
