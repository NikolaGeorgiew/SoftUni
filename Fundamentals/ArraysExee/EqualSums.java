package ArraysExee;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;

        for (int index = 0; index < inputArr.length; index++) {
            int currentNumb = inputArr[index];
            int leftSum = 0;
            int righStum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum +=  inputArr[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex <inputArr.length ; rightIndex++) {
                righStum += inputArr[rightIndex];
            }
                if (leftSum == righStum) {
                    isFound = true;
                    System.out.println(index);
                    break;

            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
