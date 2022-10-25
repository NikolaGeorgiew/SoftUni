package MethodsExe;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            if (isPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }


            input = scanner.nextLine();
        }
    }
    private static boolean isPalindrome(String number) {
        String reversedString = "";
        for (int i = number.length() - 1; i >= 0 ; i--) {
            reversedString += number.charAt(i);
        }
        if (reversedString.equals(number)){
            return true;
        } else {
            return false;
        }
    }
}
