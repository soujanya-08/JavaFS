package com.wipro.carms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.carms.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{

}
