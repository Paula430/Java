import java.util.Objects;

public class Horse extends Animal {
    private HorseBreed breed;
    public boolean isRaceHorse;

    public Horse(String name, double weight, HorseBreed breed, String color, boolean isRaceHorse, int age) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.isRaceHorse=isRaceHorse;

        if(weight<0 && weight>1000) {
            System.out.println("Invalid weight, enter weight in range (0, 1000]");
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

    public Horse() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(breed, isRaceHorse);
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
        Horse other = (Horse) obj;
        return Objects.equals(breed, other.breed) && isRaceHorse == other.isRaceHorse;
    }

    @Override
    public String toString() {
        return "Horse [breed=" + breed + ", isRaceHorse=" + isRaceHorse + ", name=" + name + ", weight=" + weight
                + ", color=" + color + ", age=" + age + "]";
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Hourse's sound");
    }


    public HorseBreed getBreed() {
        return breed;
    }

    public void setBreed(HorseBreed breed) {
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
