package StacksAndQueExe;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int elementToPush = Integer.parseInt(input[0]);
        int elementToPop = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);

        String[] elements = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < elements.length; i++) {
            stack.push(Integer.parseInt(elements[i]));
        }
        for (int i = 0; i < elementToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println("0");
        } else if (stack.contains(elementToSearch)){
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }

    }
}
