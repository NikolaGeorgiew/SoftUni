package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbArray = Arrays.stream(scanner.nextLine().split( " ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i : numbArray) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
