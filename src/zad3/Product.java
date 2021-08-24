package zad3;

import java.util.Arrays;

public class Product {

    private Skladnik[] ingredients;

    public Product(int size) {
        ingredients = new Skladnik[size];
    }

    public void add(Skladnik... skladnik) {
        if (!(skladnik.length == ingredients.length)) {
            throw new IllegalArgumentException("Size must be the same equals");
        }

        for (int i = 0; i < ingredients.length; i++) {
            ingredients[i] = skladnik[i];
        }
    }

    public double pricePlusMargin() {
        double sum = 0;
        for (Skladnik skladnik : ingredients) {
            sum += skladnik.getPriceKg().doubleValue()*skladnik.getWeightKg();
        }
        return sum * 1.15;
    }


    @Override
    public String toString() {
        return "Product{" +
                "ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}
