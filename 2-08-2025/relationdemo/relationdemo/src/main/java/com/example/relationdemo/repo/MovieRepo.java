package com.example.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationdemo.entity.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
