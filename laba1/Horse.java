package com.laba1;

public class Horse extends Animal {
	private Breed breed;
	private String color;
	public boolean isRaceHorse;

	public Horse(Breed breed, String color, boolean isRaceHorse) {
		this.breed=breed;
		this.color=color;
		this.isRaceHorse=isRaceHorse;
		
	}
	
	public Horse() {
		
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
		System.out.println("Hourse's sound");
	}
	

}
