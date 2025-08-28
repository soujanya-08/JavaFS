package com.wipro.letsgo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.letsgo.entity.Vehicle;
import com.wipro.letsgo.repo.VehicleRepo;
import com.wipro.letsgo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepo vehicleRepo;

	@Override
	public void save(Vehicle v) {
		vehicleRepo.save(v);
		
	}
	
	
}
