package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikerepo;

	public List<Bike> getBikeDetailDao() {
		return bikerepo.findAll();
	}
}
