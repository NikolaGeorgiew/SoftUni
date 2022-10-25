package Pregovor;

import java.util.Scanner;

public class MultiplicationTableSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());
        int n2 = Integer.parseInt (scanner.nextLine());

        int sum = 0;
        if (n2 > 10){
            System.out.printf("%d X %d = %d", n, n2, n * n2);
        }
        for (int i = n2; i <= 10; i++) {
            sum = n * i;
            System.out.printf("%d X %d = %d%n", n, i, sum);
        }
    }
}
