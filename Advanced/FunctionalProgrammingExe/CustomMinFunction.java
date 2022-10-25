package FunctionalProgrammingExe;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);


        Function<Integer[],Integer> function = arr -> {
            int min = Integer.MAX_VALUE;
            for (Integer number : arr) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };
        System.out.println(function.apply(numbers));
    }
}
