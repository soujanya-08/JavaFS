package com.wipro.firstboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.firstboot.repo.CityRepo;
import com.wipro.firstboot.service.impl.Cityimpl;
@Service
public class CityService implements Cityimpl {
	@Autowired
	CityRepo cityRepo;
	@Override
	public List<String> getCityList() {
		
		return cityRepo.getCityList();
	}

}
