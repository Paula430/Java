package com.laba1;

import java.util.Objects;

public class Tiger extends Animal {
	private int speed;

	public Tiger(String name, double weight, int speed, int age) {
		this.name=name;
		
		if(weight<0 && weight>500) {
			System.out.println("Invalid weight, enter weight in range (0, 500]");
			this.weight=1;
		}else {
			this.weight=weight;
		}
		
		if(speed<0) {
			System.out.println("Speed should be positive value");
		}else {
			this.speed=speed;
		}
		
		if(age<0) {
			System.out.println("Age should be positive value.");
			this.age=1;
		}else {
			this.age=age;
		}
	}
	
	public Tiger() {
		
	}

	@Override
	public void eat() {
		System.out.println("Tiger is eating");
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("Tiger's sound");
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(speed);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiger other = (Tiger) obj;
		return speed == other.speed;
	}
	
	@Override
	public String toString() {
		return "Tiger [speed=" + speed + ", name=" + name + ", weight=" + weight + ", color=" + color + ", age=" + age
				+ "]";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight=weight;
	}

}
