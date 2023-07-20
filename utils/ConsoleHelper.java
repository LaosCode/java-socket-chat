package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        while (true) {
            try {
                String buf = bufferedReader.readLine();
                if (buf != null)
                    return buf;
            } catch (IOException e) {
                writeMessage("An error occurred while trying to enter text. Try again.");
            }
        }
    }

    public static int readInt() {

        while (true) {
            try {
                return Integer.parseInt(readString().trim());
            } catch (NumberFormatException e) {
                System.out.println("An error occurred while trying to enter a number. Try again.");
            }
        }
    }

}
