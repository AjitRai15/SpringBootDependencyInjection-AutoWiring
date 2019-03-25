package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDiApplication.class, args);

//---------------------------------------------------------------------------------------//
// Without Autowiring		
//		Laptop l=context.getBean(Laptop.class);
		
//		Bean1 b=context.getBean(Bean1.class);
//		b.setLaptop(l);
//		b.show();
		
//-----------------------------------------------------------------------------------//		
		//With Autowiring
		
		Bean1 b=context.getBean(Bean1.class);
		b.show();
		
		Bean2 b1=context.getBean(Bean2.class);
		b1.show();
		
		
		
	} 

}
