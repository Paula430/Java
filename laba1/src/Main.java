import entities.*;
import interfaces.IMakeSound;

public class Main {

    public static void main(String[] args) {
        CatBreed breedBritish = new CatBreed("British", "lazy");
        DogBreed breedBulldog = new DogBreed("Bulldog", "medium");
        HorseBreed breedMustang=new HorseBreed("Mustang",65);
        HorseBreed breedArabic=new HorseBreed("Arabic",48);

        Animal dog1=  new Dog("Charlie", 10.3, breedBulldog, "brown", true, 1, 10);
        Animal horse1=new Horse("Willow", 280,breedMustang,"black", true, 5, 30);
        Animal horse2=new Horse("Willow", 280,breedMustang,"black", true, 5, 35);

        IMakeSound cat1= new Cat("Sabrina", 5, breedBritish, "grey", 3, 13);
        IMakeSound bird1= new Bird("Coco", 4, 1,"black",true );

        animalSound(cat1);
        animalSound(bird1);

        Animal[] animals= {dog1, horse1};

        for (Animal i : animals ) {
            animalEat(i);
        }

        System.out.println(Animal.getNumberOfAnimal());
    }



    public static void animalEat(Animal animal) {
        animal.eat();
    }

    public static void animalSound(IMakeSound iMakeSound) {
        iMakeSound.makeSound();
    }

}
