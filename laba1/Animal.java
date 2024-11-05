package com.laba1;

public class Animal {
	
	private String name;
	private double weight;

	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public Animal() {

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void makeSound() {
		System.out.println("Animal's sound");
	}

	void eat() {
		System.out.println("Animal is eating");
	}
	
}

