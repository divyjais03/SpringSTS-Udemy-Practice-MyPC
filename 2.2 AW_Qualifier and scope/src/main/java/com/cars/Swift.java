package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.interfaces.Car;
import com.interfaces.Engine;

@Component("c1")
//component based programming is where we can replace something with something else very easily
//we can develop one application and we can distribute to various places and based on our requirement
// we can remove and add components.
public class Swift implements Car {

	@Autowired
	@Qualifier("v8")
	Engine engine;
	
	@Override
	public String specs() {
		
		return "Hatchbaack from suziki "+ engine.type();
	}

}
