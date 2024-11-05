package com.laba1;

public class Tiger extends Animal {
	private int speed;

	public Tiger(int speed) {
		this.speed=speed;
	}
	
	public Tiger() {
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void makeSound() {
		System.out.println("Tiger's sound");
	}

}
