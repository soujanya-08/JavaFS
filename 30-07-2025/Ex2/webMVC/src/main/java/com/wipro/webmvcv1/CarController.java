package com.wipro.webmvcv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.webmvcv1.service.CarService;

@Controller
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarService carService;
	
	@GetMapping("/list")
	String showProdList(Model model)
	{ 
		model.addAttribute("carList", carService.getCarList());
		return "carlist";
		
	}
	
	

}