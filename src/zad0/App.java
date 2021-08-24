package zad0;

public class App {

    public static void main(String[] args) {

        Dog dog1 = new Dog(34, 15, "Sasa", "Kundel");
        dog1.speak();
        dog1.aport();

        Animal animal3 = new Animal(10, 10, "Bbb");
        animal3.speak();


        Animal dog2 = new Dog(10, 12, "Luis", "Owczarek");
        dog2.speak();


        Cat cat1 = new Cat(25, 25, "Kicia", "black");
        cat1.speak();

        Cat cat2 = new Cat(5, 3, "Leon", "grey");
        cat1 = cat2;
        cat1.speak();

        dog2 = dog1;
        dog2 = cat1;

    }
}
