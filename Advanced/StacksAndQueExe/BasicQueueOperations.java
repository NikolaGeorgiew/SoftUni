package StacksAndQueExe;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int elementToOffer = Integer.parseInt(input[0]);
        int elementToPoll = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);
        String[] elements = scanner.nextLine().split(" ");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elements.length; i++) {
            queue.offer(Integer.parseInt(elements[i]));
        }
        for (int i = 0; i < elementToPoll; i++) {
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println("0");
        } else if (queue.contains(elementToSearch)){
            System.out.println(true);
        } else {
            System.out.println(Collections.min(queue));
        }

    }
}
