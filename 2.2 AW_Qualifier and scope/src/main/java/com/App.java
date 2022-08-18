package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;


import com.interfaces.Car;

@Scope(value="prototype")
public class App {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		
			//Car mycar= context.getBean("swift",Car.class);  // we can directly specify class name but in lower case only 
			                                                  
			Car mycar = context.getBean("c2", Car.class);	  // or give your own name in @Component("name")..
			
			System.out.println(mycar.specs());
			
			
	
			Car mc = context.getBean("c1", Car.class);			// by defining scope= prototype: it produces a new instance every time bean is requested
			System.out.println(mc.specs());
			context.close();
	}
	

}
