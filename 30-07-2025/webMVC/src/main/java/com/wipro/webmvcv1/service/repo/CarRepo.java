package com.wipro.webmvcv1.service.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepo {
	public List<String> getCarList() {		
		List<String> carList= Arrays.asList("Hyundai","Mercedes","Ford","BMW");
		return carList;
	}

}
