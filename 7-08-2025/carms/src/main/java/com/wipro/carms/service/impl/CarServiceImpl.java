package com.wipro.carms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.carms.entity.Car;
import com.wipro.carms.repo.CarRepo;
import com.wipro.carms.service.CarService;
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepo carRepo;
	@Override
	public void save(Car car) {
		carRepo.save(car);
		
	}

	@Override
	public List<Car> findAll() {
		
		return carRepo.findAll();
	}

	@Override
	public void deleteById(int id) {
		carRepo.deleteById(id);
		
	}

}
