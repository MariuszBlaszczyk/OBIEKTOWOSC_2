package zad0;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;

    public Dog(int weight, int height, String name, String breed) {
        super(weight, height, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void aport() {
        System.out.println("Running for the ball");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Hi,I'm dog ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = " + getName() +
                "breed='" + breed + '\'' +
                '}';
    }
}


