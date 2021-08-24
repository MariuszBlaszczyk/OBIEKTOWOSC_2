package zad3;

import java.math.BigDecimal;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Skladnik ingredients1 = new Skladnik();
        ingredients1.setName("kurczak");
        ingredients1.setPriceKg(new BigDecimal("10.5"));
        ingredients1.setWeightKg(0.65);

        Optional<Skladnik> skladnikOptional = Skladnik.create("asdf", 2.5, new BigDecimal("9.0"));
        Skladnik skladnik2 = null;
        if (skladnikOptional.isPresent()) {
            skladnik2 = skladnikOptional.get();
        } else {
            System.out.println("ERROR");
        }

        System.out.println(ingredients1);
        System.out.println(skladnik2);

        Product product1 = new Product(3);
        product1.add(ingredients1, skladnik2, skladnik2);
        System.out.println(product1);

        System.out.println("margin");
        System.out.println(product1.pricePlusMargin());

    }
}
