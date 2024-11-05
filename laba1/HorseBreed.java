package com.laba1;

public class HorseBreed implements Breed{
	private String name;
	private double speed;
	
    public HorseBreed(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
	
    public HorseBreed() {
    	
    }
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void printBreed() {
		System.out.println("Horse Breed name: " + name);
		System.out.println("Horse speed : " + speed);
	}
}
