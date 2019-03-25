package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {
	
	private int bid;
	private String bname;
	private String btech;
	
	
	
	
	public Bean2() {
		System.out.println("Object Created for bean2");
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBtech() {
		return btech;
	}


	public void setBtech(String btech) {
		this.btech = btech;
	}


	public void show() {
		System.out.println("Method 2 working");
	}

}


