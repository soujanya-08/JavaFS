package com.wipro.firstboot.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CityRepo {
	
	public List<String> getCityList(){
		return Arrays.asList("Hubli", "Bengaluru", "Gadag", "Sirsi");
	}

}
