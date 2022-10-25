package MethodsExe;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacter(text);

    }
    private static void printMiddleCharacter(String text) {
        if (text.length() % 2 != 0) {
            int indexMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexMiddleChar));
        } else {
            int indexFirstMiddleChar = text.length() / 2 - 1;
            int indexSecondMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexFirstMiddleChar) + "" + text.charAt(indexSecondMiddleChar));
        }
    }
}
