package zad0;

import java.util.Objects;

public class Animal {

    private int weight;
    private int height;
    private String name;

    public Animal(int weight, int height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }


    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void speak() {
        System.out.println("My name is " + name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && height == animal.height && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height, name);
    }
}
