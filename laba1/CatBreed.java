package com.laba1;

public class CatBreed implements Breed{
	
	private String name;
	private String characteristic;
	
	public CatBreed(String name, String characteristic) {
        this.name=name;
        this.characteristic=characteristic;
    }
	
	public CatBreed() {
   
    }
	
	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void printBreed() {
		System.out.println("Cat Breed name: " + name);
		System.out.println("Cat characteristic : " + characteristic);
	}
}
