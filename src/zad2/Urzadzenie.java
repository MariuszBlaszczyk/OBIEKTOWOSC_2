package zad2;

import java.math.BigDecimal;
import java.util.Objects;

public class Urzadzenie {

    private String producent;
    private BigDecimal price;

    public Urzadzenie(String producent, BigDecimal price) {
        this.producent = producent;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal calculatePrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Urzadzenie that = (Urzadzenie) o;
        return price == that.price && Objects.equals(producent, that.producent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, price);
    }

    @Override
    public String toString() {
        return "Urzadzenie{" +
                "producent='" + producent + '\'' +
                ", price=" + price +
                '}';
    }
}
