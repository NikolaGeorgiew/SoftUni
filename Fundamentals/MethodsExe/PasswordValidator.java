package MethodsExe;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidDigits(password) && isValidLength(password) && isValidContent(password)){
            System.out.println("Password is valid");
        }

    }
    private static boolean isValidLength(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean isValidContent(String pass) {
        for (char symbol: pass.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return  false;
            }
        }
        return true;
    }
    private static boolean isValidDigits (String pass) {
        int counter = 0;
        for (char symbol: pass.toCharArray()) {
            if (Character.isDigit(symbol)){
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
