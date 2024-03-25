package com.practice.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class SpringConfig {

	@Bean
	SpringVehicle vehicle() {
		var veh = new SpringVehicle();
		veh.setName("Audi from config");
		return veh;
	}
	
	@Bean
	SpringVehicle vehicle2() {
		var veh = new SpringVehicle();
		veh.setName("BMW from config");
		return veh;
	}
	@Bean
	String hello() {
		return "Hello from config";
	}
	
	@Bean
	@Primary
	String helloWorld() {
		return "Hello world from config";
	}
	@Bean
	Integer inte() {
		return 16;
	}
}
