import java.util.Objects;

public class Cat extends Animal {
    private CatBreed breed;

    public Cat(String name,double weight, CatBreed breed, String color, int age) {
        this.name=name;
        this.breed=breed;
        this.color=color;

        if(weight<0 && weight>100) {
            System.out.println("Invalid weight, enter weight in range (0, 100]");
            this.weight=1;
        }else {
            this.weight=weight;
        }

        if(age<0) {
            System.out.println("Age should be positive value.");
            this.age=1;
        }else {
            this.age=age;
        }
    }

    public Cat() {

    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat's sound");
    }

    @Override
    public String toString() {
        return "Cat [breed=" + breed + ", name=" + name + ", weight=" + weight + ", color=" + color + ", age=" + age
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(breed);
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
        Cat other = (Cat) obj;
        return Objects.equals(breed, other.breed);
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(CatBreed breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
