package StacksAndQueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberWithStack {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (String s : stack) {
            System.out.printf("%s ", stack.pop());
        }
    }
}
