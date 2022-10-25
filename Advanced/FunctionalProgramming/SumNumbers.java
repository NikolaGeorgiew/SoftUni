package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], String> count = elements -> "Count = " + String.valueOf(Arrays.stream(elements).count());
        Function<int[], String> sum = elements -> "Sum = " + Arrays.stream(elements).sum();


        System.out.println(count.apply(numbers));
        System.out.println(sum.apply(numbers));


    }
}
