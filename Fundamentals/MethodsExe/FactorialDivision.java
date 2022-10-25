package MethodsExe;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt (scanner.nextLine());
        int number2 = Integer.parseInt (scanner.nextLine());

        double result = fact(number1) * 1.0 / fact(number2);

        System.out.printf("%.2f",result);

    }
    private static long fact(int num1) {
        long fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
