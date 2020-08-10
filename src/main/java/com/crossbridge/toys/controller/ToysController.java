package com.crossbridge.toys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crossbridge.toys.service.ToysService;

@RequestMapping("/toys")
@RestController
public class ToysController {
	
	@Autowired
    ToysService service;

	@RequestMapping("/input")
	 public String home(@RequestParam int rupees) {
		String retStr = service.calculateMaxNoOfToys(rupees);
		return retStr;
	 }
}
