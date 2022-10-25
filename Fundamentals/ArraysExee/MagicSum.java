package ArraysExee;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt (scanner.nextLine());

        for (int index = 0; index < inputArr.length; index++) {
            int number = inputArr[index];

            for (int i = index + 1; i < inputArr.length; i++) {
                int number2 = inputArr[i];
                if (number + number2 == n) {
                    System.out.printf("%d %d%n", number, number2);
                }
            }

        }
    }
}
