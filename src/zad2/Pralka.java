package zad2;

import java.math.BigDecimal;

public class Pralka extends Urzadzenie {

    private int countPrograms;
    private int capacity;

    public Pralka(String producent, BigDecimal price, int countPrograms, int capacity) {
        super(producent, price);
        this.countPrograms = countPrograms;
        this.capacity = capacity;
    }


    @Override
    public BigDecimal calculatePrice() {
        BigDecimal price = getPrice();
        BigDecimal plusTwoHundred = new BigDecimal("200");
        BigDecimal plusHundred = new BigDecimal("100");
        if (capacity > 50) {
            price = price.add(plusTwoHundred);
        }
        if (countPrograms > 10) {
            price = price.add(plusHundred);
        }
        return price;

    }
}
