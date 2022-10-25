package ArraysAgain;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int currentNumb : numbArray) {
            if (currentNumb % 2 == 0) {
                sum += currentNumb;
            }
        }
        System.out.println(sum);
    }
}
