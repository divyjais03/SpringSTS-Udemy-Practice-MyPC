package com.specs;

import org.springframework.stereotype.Component;

import com.interfaces.Engine;

@Component
public class V6 implements  Engine{

	@Override
	public String type() {
		
		return "V6 Engine";
	}

}
