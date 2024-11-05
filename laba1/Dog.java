package com.laba1;

public class Dog extends Animal {
	private Breed breed;
	private String color;
	public boolean isTrained=false;

	public Dog(Breed breed, String color, boolean isTrained) {
		this.breed=breed;
		this.color=color;
		this.isTrained=isTrained;
	}
	
	public Dog() {
		
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
	    System.out.println("Dog's sound");
    }

}
