package ArraysThird;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < inputArr.length; i++) {
            int currentNum = inputArr[i];

            if (currentNum % 2 == 0) {
                sumEven += currentNum;
            } else {
                sumOdd += currentNum;
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
