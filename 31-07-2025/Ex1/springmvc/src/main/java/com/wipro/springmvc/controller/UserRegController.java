package com.wipro.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.springmvc.entity.UserReg;

@Controller
@RequestMapping("/user")
public class UserRegController {
	
	@GetMapping("/register")
	String showLoginForm(Model m)
	{
		return "register";
	}
	
//	@PostMapping("/loginsubmit")
//	String submitLoginForm(@ModelAttribute("logindata") UserReg user,Model m)
//	{
//		System.out.println(user);
//		return "userSubmit";
//	}
	
	@PostMapping("/userSubmit")
	String submitTestLoginForm(@ModelAttribute("registerdata") UserReg user,Model m)
	{
		 
		return "userSubmit";
	}

}
