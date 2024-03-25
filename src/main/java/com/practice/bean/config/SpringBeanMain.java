package com.practice.bean.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.bean.config.SpringConfig;

public class SpringBeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringVehicle veh = new SpringVehicle();
		veh.setName("BMW from non-spring context");
		System.out.println(veh.getName());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		SpringVehicle vehicle = context.getBean("vehicle",SpringVehicle.class);
		
		System.out.println("Bean of object from spring context : " + vehicle.getName());
		
		String hello = context.getBean(String.class);
		System.out.println("Bean of string from spring context : "+ hello);
		
		Integer inte = context.getBean(Integer.class);
		System.out.println("Bean of Integer from spring context : "+ inte);
	}

}
