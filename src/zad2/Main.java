package zad2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Pralka pralka1 = new Pralka("Amica", new BigDecimal("1000"), 5, 20);
        Pralka pralka2 = new Pralka("Bosch", new BigDecimal("2000"), 15, 10);
        Pralka pralka3 = new Pralka("Whirlpool", new BigDecimal("3000"), 35, 60);

        System.out.println(pralka1.calculatePrice());
        System.out.println(pralka2.calculatePrice());
        System.out.println(pralka3.calculatePrice());


    }
}
