package zad4;

public class Main {

    public static void main(String[] args) {

        System.out.println(Klawiatura.generateSign());
        System.out.println(Klawiatura.generateSign());
        System.out.println(Klawiatura.generateSign());
        System.out.println(Klawiatura.generateSign());
        System.out.println(Klawiatura.getText());

        Klawiatura.deleteLastSign();
        System.out.println(Klawiatura.getText());
        Klawiatura.clear();
        System.out.println("CLEAR" + Klawiatura.getText());
    }
}
