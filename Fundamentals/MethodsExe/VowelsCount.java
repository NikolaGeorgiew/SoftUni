package MethodsExe;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printVowelsCount(text);


    }
    private static void printVowelsCount(String text) {
        int counter = 0;
        for (char symbol: text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'u' || symbol == 'i') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
