package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	@Autowired
	BikeService bikeservice;

	@GetMapping(value = "/getbikedetails")
	public List<Bike> getBikeDetails() {
		System.out.println();
		return bikeservice.getBikeDetailService();
	}

}
