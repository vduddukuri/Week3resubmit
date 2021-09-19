package com.org;

public class LawnMower {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
 
	public LawnMower(String location) {
		this.location = location;
		speed = OFF;
	}
  
	public void high() {
		speed = HIGH;
		System.out.println(location + " lawnmower is on high");
	} 
 
	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " lawnmower is on medium");
	}
 
	public void low() {
		speed = LOW;
		System.out.println(location + " lawnmower is on low");
	}
  
	public void off() {
		speed = OFF;
		System.out.println(location + " lawnmower is off");
	}
  
	public int getSpeed() {
		return speed;
	}
}
