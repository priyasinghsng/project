package com.singh.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.singh.flightreservation.model.Flight;
import com.singh.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("/findflights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, 
			@RequestParam("departureDate") @DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
		
		List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
		if(from==null || to==null || departureDate==null) {
			modelMap.addAttribute("msg", "Incomplete data input, please review");
		} else {
		modelMap.addAttribute("flights", flights);
		}
		return "displayflights";
	}
}
