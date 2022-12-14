package ArraysExe;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 1; i <= n; i++) {
            String numbers = scanner.nextLine();
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);

            if (i % 2 == 0){
                for (int num : firstArray) {
                    firstArray[i - 1] = secondNumber;
                    secondArray [i - 1] = firstNumber;
                }
            }else {
                firstArray[ i - 1] = firstNumber;
                secondArray[ i - 1] = secondNumber;
            }
        }
        for (int num: firstArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num1: secondArray) {
            System.out.print(num1 + " ");
        }
    }
}
