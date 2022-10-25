package MethodsExe;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt (scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (isDivisibleBy8(i) && isThereOdd(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isDivisibleBy8(int numb) {
        int sumDigits = 0;
        while (numb > 0) {
            int lastDigit = numb % 10;
            sumDigits += lastDigit;

            numb /= 10;
        }
        if (sumDigits % 8 == 0){
            return true;
        }else {
            return false;
        }
    }
    private static boolean isThereOdd(int numb) {
        while (numb > 0) {
            int lastDigit = numb % 10;
            if (lastDigit % 2 != 0){
                return true;
            }
            numb /= 10;
        }
        return false;
    }
}
