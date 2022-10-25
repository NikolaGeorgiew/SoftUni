package FunctionalProgramming;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> queue = new ArrayDeque<>();

        Predicate<String> predicate = c -> Character.isUpperCase(c.charAt(0));


         Arrays.stream(input).filter(predicate)
                 .forEach(queue::offer);

        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }
}
