package com.singh.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.singh.flightreservation.model.User;
import com.singh.flightreservation.repos.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "registerUser";
	}
	
	@PostMapping("/registerUser")
	public String register(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam ("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		User user= userRepository.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return "findflights";
		}
		else {
			modelMap.addAttribute("msg", "Incorrect Username or Password. Please try again");	
		}
		return "login";
	}

}
