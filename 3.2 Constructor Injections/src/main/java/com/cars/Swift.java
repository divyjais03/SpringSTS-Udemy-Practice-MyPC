package com.cars;



import com.interfaces.Car;

//@Component("c1")     // bcz we put the method in @bean in AppConfig

public class Swift implements Car {

	@Override
	public String specs() {
		
		return "Hatchbaack from suziki";
	}

}
