package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
	@Autowired
	BikeDao bikedao;

	public List<Bike> getBikeDetailService() {
		return bikedao.getBikeDetailDao();
	}

}
