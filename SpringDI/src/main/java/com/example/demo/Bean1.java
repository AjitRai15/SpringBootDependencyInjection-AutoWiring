package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Bean1 {
	
	private int id;
	private String name;
	private String tech;
	@Autowired
	private Laptop laptop;
	
	
	public Bean1() {
		System.out.println("Object Created for bean1");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

//------------------------------------------------------------------------//
	//Without Autowiring calling 
	
/*	public void show() {
	System.out.println("Method 1 working");
		getLaptop().compile();
	}*/
//--------------------------------------------------------------------------//

	public void show() {
		System.out.println("Method 1 working");
		laptop.compile();
	}


}
