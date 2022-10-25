package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OsPlanning {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(tasks::push);

        ArrayDeque<Integer> threads = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(threads::offer);
        int taskToKill = Integer.parseInt (scanner.nextLine());
        int currentTask = tasks.peek();
        int currentThread = threads.peek();
        while (currentTask != taskToKill) {
            if (currentThread >= currentTask) {
                tasks.pop();
            }
            threads.poll();


            currentTask = tasks.peek();
            currentThread = threads.peek();

        }
        System.out.printf("Thread with value %d killed task %d%n",threads.peek(), taskToKill);
        for (Integer thread : threads) {
            System.out.print(thread + " ");
        }
    }
}
