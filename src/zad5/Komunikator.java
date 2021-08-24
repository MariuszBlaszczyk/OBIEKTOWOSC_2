package zad5;

import java.io.*;
import java.util.Scanner;

public class Komunikator {

    private String message;


    public Komunikator(String filename) {
        message = readData(filename);
    }

    public String getMessage() {
        return message;
    }


    private String readData(String filename) {
        if (filename == null || filename.length() == 0) {
            throw new IllegalArgumentException("Filename is not correct");
        }

        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return stringBuilder.toString();
    }

    private String checkMessage() {
        String regex = "[^A-Za-z0-9\\s]";
        String result = message.replaceAll(regex, "");

        if (result.isEmpty() || result.isBlank()) {
            System.out.println("Text is empty");
            return null;
        }

        return result;
    }

    public void sendMessage() {
        String message = checkMessage();
        if (message == null) {
            return;
        }
        String file = "src/zad5/wiadomosc.txt";
        try (FileWriter writer = new FileWriter(file); PrintWriter printWriter = new PrintWriter(writer)) {
            printWriter.print(message);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
