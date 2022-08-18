package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import com.interfaces.Car;
import com.interfaces.Engine;

//@Component("c2")				we made function in AppConfig so no need of this now
public class Corolla implements Car {

	@Autowired				//whenever we autowired directly we basically make use of the default constructor
	@Qualifier("engineType")
	Engine engine;



	@Override
	public String specs() {
		
		String specs="Sedan from Toyota with engine type as "+ engine.type();		// engine.getType();- when we generate getters in Engine class
		return specs;
	}


	

}

// there is a difference between constructor and setter: setter is a method which is used to update the object later on the line
// whereas constructor is used to create the object itself so usage of Autowired on a setter and constructor is little different


