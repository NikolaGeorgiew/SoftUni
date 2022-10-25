package ArraysExee;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArr.length; i++) {
            int currentNum = inputArr[i];
            if (i == inputArr.length - 1) {
                System.out.print(currentNum + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j <inputArr.length ; j++) {
                int nextNumber = inputArr[j];
                if (currentNum > nextNumber) {
                    isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
