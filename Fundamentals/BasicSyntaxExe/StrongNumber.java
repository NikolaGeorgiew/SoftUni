package PregovorExe;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt (scanner.nextLine());
        int sum = 0;
        int startNumber = number;


        while (number > 0){
            int currentDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= currentDigit; i++) {
                fact = fact * i;
            }
            sum += fact;
            number = number / 10;
        }
        if (sum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
