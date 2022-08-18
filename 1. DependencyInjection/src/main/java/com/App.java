package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cars.Corolla;
import com.cars.Swift;
import com.interfaces.Car;

public class App {

	public static void main(String[] args) {
		Car swift= new Swift();
		Car corolla= new Corolla();
		
		System.out.println(swift.specs());
		System.out.println(corolla.specs());
		
		//Car mycar= new Swift();				// here we are manually making objects of different classes
		//System.out.println(mycar.specs());	//to avoid this we can use component based programming 
		
	// For doing component based programming we have AnnotationConfigAplicationContext:
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		//context is reference to our bean factory-- place where spring keeps all the object it creates
		// using this context we can extract the object from bean factory
		
		// this concept of injecting the object from the bean factory to a class object is dependency injection
		
		
			//Car mycar= context.getBean("swift",Car.class);  // we can directly specify class name but in lower case only 
			                                                  
			Car mycar = context.getBean("c2", Car.class);	  // or give your own name in @Component("name")..
			
			System.out.println(mycar.specs());
			context.close();
			
	}

}
