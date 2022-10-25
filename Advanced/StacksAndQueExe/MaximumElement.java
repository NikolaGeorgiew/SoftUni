package StacksAndQueExe;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt (scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            if (command.equals("1")){
                int number = Integer.parseInt(input[1]);
                stack.push(number);
            } else if (command.equals("2")){
                stack.pop();
            } else if (command.equals("3")){
                System.out.println(Collections.max(stack));
            }

        }
    }
}
