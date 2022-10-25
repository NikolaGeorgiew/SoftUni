package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")){
            if (input.equals("cancel")) {
                String output = queue.isEmpty() ? "Printer is on standby"
                        : "Canceled " + queue.poll();
                System.out.println(output);
            } else {
                queue.offer(input);
            }

            input = scanner.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
