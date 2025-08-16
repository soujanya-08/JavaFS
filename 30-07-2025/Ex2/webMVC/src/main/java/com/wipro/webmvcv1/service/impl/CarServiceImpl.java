package com.wipro.webmvcv1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.webmvcv1.service.CarService;
import com.wipro.webmvcv1.service.repo.CarRepo;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	CarRepo carRepo;
	@Override
	public List<String> getCarList() {
		 
		return carRepo.getCarList();
	}

}
