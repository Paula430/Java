package com.laba1;

public class Main {

	public static void main(String[] args) {
		CatBreed breedBritish= new CatBreed("British", "lazy");
		Cat cat1=new Cat(breedBritish,"grey");
		cat1.setName("Sabrina");
		cat1.setWeight(5);
		
		DogBreed breedBulldog= new DogBreed("Bulldog", "medium");
		Dog dog1= new Dog(breedBulldog,"brown",true);
		dog1.setName("Charlie");
		dog1.setWeight(10.3);
		
		HorseBreed breedHorse=new HorseBreed("Mustang",65);
		Horse horse1=new Horse(breedHorse,"black", true);
		horse1.setName("Willow");
		horse1.setWeight(500);

		System.out.println("Cat name: " + cat1.getName());
		System.out.println("Cat breed: " + cat1.getBreed().getName());
		System.out.println("Cat weight: " + cat1.getWeight());
		breedBritish.printBreed();		
		cat1.makeSound();
		System.out.println("Dog name: " + dog1.getName());
		System.out.println("Dog breed: " + dog1.getBreed().getName());
		System.out.println("Dog color: " + dog1.getColor());
		System.out.println("Dog weight: " + dog1.getWeight());
		dog1.makeSound();
		System.out.println("Horse name: " + horse1.getName());
		System.out.println("Horse breed: " + horse1.getBreed().getName());
		System.out.println("Horse weight: " + horse1.getWeight());
		horse1.makeSound();
		cat1.eat();
		breedBulldog.setSize("xxl");
		
	}

}

