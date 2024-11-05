package com.laba1;

public class DogBreed implements Breed {
	private String name;
	private String size;
	
	public DogBreed(String name, String size) {
        this.name=name;
        this.size=size;
    }
	
	public DogBreed() {

    }
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		String[] sizeArray= {"small", "medium", "big"};
		boolean isValidSize=false;
		
		for(int i=0; i<sizeArray.length; i++) {
			if(sizeArray[i].equalsIgnoreCase(size)) {
				isValidSize=true;
				break;
			}
			
		}
		
		if(isValidSize) {
			this.size=size;
		}else {
			System.out.println("Invalid size. Please choose 'small', 'medium', or 'big'.");
		}
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void printBreed() {
		System.out.println("Dog Breed name: " + name);
		System.out.println("Dog size : " + size);
	}

}
