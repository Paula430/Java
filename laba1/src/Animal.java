import java.util.Objects;

public abstract class Animal {

    protected String name;
    protected double weight;
    protected String color;
    protected int age;

    public abstract void makeSound();
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name)
                && Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
    };


}

