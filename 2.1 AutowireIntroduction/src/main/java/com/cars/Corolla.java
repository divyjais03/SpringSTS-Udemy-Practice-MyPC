package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interfaces.Car;

@Component("c2")				// if we do not give name then in main function use class name in getbean in lower case...
public class Corolla implements Car {

	@Autowired			//whenever we autowired directly we basically make use of the default constructor
	Engine engine;


    //@Autowired			// if we are using setter the we have to autowire it for working setter otherwise setter will get ignored
	/*
	 * public void setEngine(Engine engine) { engine.type="New V8 Engine";
	 * this.engine = engine; }
	 */

	public Corolla(Engine engine) {			// if we are using constructor then no need to autowire specifically property autowire is good
		super();
		engine.type="New V8 from constructor";
		this.engine = engine;
	}

	@Override
	public String specs() {
		
		String specs="Sedan from Toyota with engine type as "+ engine.type;		// engine.getType();- when we generate getters in Engine class
		return specs;
	}


	

}

// there is a difference between constructor and setter: setter is a method which is used to update the object later on the line
// whereas constructor is used to create the object itself so usage of Autowired on a setter and constructor is little different

// THIRD VIDEO ONLY THIS :) QUALIFIER ANNOTATIONS

// if we make the engine class as interface and implements two classes from it named V8 & V6, then have to make both the classes as component
// and on calling @Autowired Engine engine it will show error., we can make Engine V8(or V6) and call using the same object.
// the better approach is use @Autowired @Qualifer("v6") Engine engine --- here qualifier removes the ambiguity os selection of implementation.

