package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt (scanner.nextLine());
        printSignNumber(numInput);
    }

    public static void printSignNumber(int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else if (n <0) {
            System.out.printf("The number %d is negative.", n);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
