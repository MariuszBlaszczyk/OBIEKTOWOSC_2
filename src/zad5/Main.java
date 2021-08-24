package zad5;

public class Main {

    public static void main(String[] args) {


        Komunikator komunikator = new Komunikator("src/zad5/text.txt");
        System.out.println(komunikator.getMessage());
        komunikator.sendMessage();

    }
}
