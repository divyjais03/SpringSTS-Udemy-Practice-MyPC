package com.cars;

import org.springframework.stereotype.Component;

import com.interfaces.Car;

@Component("c1")
//component based programming is where we can replace something with something else very easily
//we can develop one application and we can distribute to various places and based on our requirement
// we can remove and add components.
public class Swift implements Car {

	@Override
	public String specs() {
		
		return "Hatchbaack from suziki";
	}

}
