public class Main {

    public static void main(String[] args) {
        CatBreed breedBritish = new CatBreed("British", "lazy");
        Cat cat1 = new Cat("Sabrina", 5, breedBritish, "grey", 3);

        DogBreed breedBulldog = new DogBreed("Bulldog", "medium");
        Dog dog1 = new Dog("Charlie", 10.3, breedBulldog, "brown", true, 1);

        HorseBreed breedMustang=new HorseBreed("Mustang",65);
        HorseBreed breedArabic=new HorseBreed("Arabic",48);
        Horse horse1=new Horse("Willow", 280,breedMustang,"black", true, 5);
        Horse horse2=new Horse("Willow", 280,breedMustang,"black", true, 5);

        Animal[] animals= {cat1, dog1, horse1};

        for (Animal i : animals ) {
            animalEat(i);
            animalSound(i);
        }

        System.out.println(horse1.equals(horse2));
        System.out.println(cat1);
        System.out.println(horse1.hashCode());
        System.out.println(horse2.hashCode());
    }

    public static void animalEat(Animal animal) {
        animal.eat();
    }

    public static void animalSound(Animal animal) {
        animal.makeSound();
    }

}
