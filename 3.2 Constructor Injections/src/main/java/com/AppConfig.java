package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cars.Corolla;
import com.cars.Swift;
import com.specs.EngineType;


@Configuration					// this tells that this is the configuration class...!
@ComponentScan("com")			// this tells spring which package needs to be installed??
public class AppConfig {

								//We add @bean here for different components that we define in the respective class: more simplified..!
	
	@Bean("c2")							
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("c1")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType() {	// we have two constructors in EngineType: default and param, here if we pass parameter in
										//RETURN then param constructor will get called otherwise default will get called.
		return new EngineType("any parameter you can pass!");
	}
	
	
}

// this last bean EngineType is using the concept of constructor injection (default & parameterized)