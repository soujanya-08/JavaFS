package com.wipro.carms.service;

import java.util.List;

import com.wipro.carms.entity.Car;

public interface CarService {
	
	void save(Car car);
	List<Car> findAll();
	void deleteById(int id);

}
