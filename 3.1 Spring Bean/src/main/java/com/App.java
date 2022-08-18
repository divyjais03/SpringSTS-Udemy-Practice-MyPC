package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.interfaces.Car;

public class App {

	public static void main(String[] args) {
		 
		
	// For doing component based programming we have AnnotationConfigAplicationContext:
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
			//Car mycar= context.getBean("swift",Car.class);  // we can directly specify class name but in lower case only 
			                                                  
			Car mycar = context.getBean("c1", Car.class);	  // or give your own name in @Component("name")..
			
			System.out.println(mycar.specs());
			context.close();
			
	}

}
