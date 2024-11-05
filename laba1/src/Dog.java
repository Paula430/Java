import java.util.Objects;

public class Dog extends Animal {
    private DogBreed breed;
    public boolean isTrained=false;

    public Dog(String name, double weight, DogBreed breed, String color, boolean isTrained, int age) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.isTrained=isTrained;

        if(weight<0 && weight>100) {
            System.out.println("Invalid weight, enter weight in range (0 100]");
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

    public Dog() {

    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", isTrained=" + isTrained + ", name=" + name + ", weight=" + weight + ", color="
                + color + ", age=" + age + "]";
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog's sound");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(breed, isTrained);
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
        Dog other = (Dog) obj;
        return Objects.equals(breed, other.breed) && isTrained == other.isTrained;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public void setBreed(DogBreed breed) {
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
