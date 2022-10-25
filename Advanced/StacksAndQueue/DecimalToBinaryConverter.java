package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (n == 0) {
            System.out.print(0);
        } else {
            while (n != 0) {
                stack.push(n % 2);
                n = n / 2;
            }
        }
        for (Integer integer : stack) {
            System.out.print(stack.pop());
        }
    }
}
