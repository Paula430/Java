package com.laba1;

public class Cat extends Animal {
	private Breed breed;
	private String color;
	
	public Cat(Breed breed, String color) {
		this.breed=breed;
		this.color=color;
	}
	
	public Cat() {
		
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void makeSound() {
		System.out.println("Cat's sound");
	}

}
