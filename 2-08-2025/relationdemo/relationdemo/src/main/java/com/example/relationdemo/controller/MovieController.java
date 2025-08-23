package com.example.relationdemo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationdemo.entity.Movie;
import com.example.relationdemo.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@PostMapping
	void save(@RequestBody Movie movie)
	{
		  movieService.save(movie);
	}
	
	@GetMapping
	List<Movie> findAll()
	{
		return movieService.findAll();
	}
}