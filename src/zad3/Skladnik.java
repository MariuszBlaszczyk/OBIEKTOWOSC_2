package zad3;


import java.math.BigDecimal;
import java.util.Optional;

public class Skladnik {

    private String name;
    private double weightKg;
    private BigDecimal priceKg;


    public Skladnik() {
    }

    private Skladnik(String name, double weightKg, BigDecimal priceKg) {
        this.name = name;
        this.weightKg = weightKg;
        this.priceKg = priceKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String regex = "^[a-z]+$";
        if (name.matches(regex)) {
            this.name = name;
        } else {
            System.out.println("Name is not correct");
        }
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        if (weightKg > 0.0) {
            this.weightKg = weightKg;
        } else {
            System.out.println("Must be minimum 1 kg");
        }
    }

    public BigDecimal getPriceKg() {
        return priceKg;
    }

    public void setPriceKg(BigDecimal priceKg) {
        if (priceKg.doubleValue() > 0.0) {
            this.priceKg = priceKg;
        } else {
            System.out.println("Must be higher then 0");
        }
    }


    public static Optional<Skladnik> create(String name, double weightKg, BigDecimal priceKg) {
        // Walidacja
        String regex = "^[a-z]+$";
        if (name.matches(regex) && weightKg > 0 && priceKg.doubleValue() > 0.0) {
            return Optional.of(new Skladnik(name, weightKg, priceKg));
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "Skladnik{" +
                "name='" + name + '\'' +
                ", weightKg=" + weightKg +
                ", priceKg=" + priceKg +
                '}';
    }
}
