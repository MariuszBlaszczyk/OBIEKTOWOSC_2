package zad4;

import java.util.Random;

public class Klawiatura {

    private static String text = "";

    public static String getText() {
        return text;
    }

    public static char generateSign() {
        int number = generateNumber(1, 10);
        int numberChar;
        if (number % 2 == 0) {
            numberChar = generateNumber(65, 90);
        } else {
            numberChar = generateNumber(97, 122);
        }
        char sign = (char) numberChar;
        text += sign;
        return sign;
    }

    private static int generateNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min is bigger than max");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    public static void deleteLastSign() {
        if (text.isEmpty() || text.length() == 0) {
            throw new IllegalArgumentException("Text is null!!!");
        }
        text = text.substring(0, text.length() - 1);
    }

    public static void clear() {
        text = "";
    }
}
