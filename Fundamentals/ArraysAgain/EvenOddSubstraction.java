package ArraysAgain;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int currentNumb : numbArray) {
            if (currentNumb % 2 == 0) {
                sumEven += currentNumb;
            } else {
                sumOdd += currentNumb;
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
