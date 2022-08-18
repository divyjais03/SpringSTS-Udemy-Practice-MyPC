package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration					// this tells that this is the configuration class...!
@ComponentScan("com")			// this tells spring which package needs to be installed??
@Scope(value="prototype")
public class AppConfig {

}
