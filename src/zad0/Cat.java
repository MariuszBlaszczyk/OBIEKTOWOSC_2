package zad0;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(int weight, int height, String name, String color) {
        super(weight, height, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice() {
        System.out.println("Mrrrrauuuu");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Hi,I'm cat ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = " + getName() +
                "color ='" + color + '\'' +
                '}';
    }
}
