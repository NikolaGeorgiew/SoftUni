package ArraysExee;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];



        for (int rows = 1; rows <= n; rows++) {
            String numbers = scanner.nextLine();
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);

            if (rows % 2 == 0) {
                for (int i = 0; i < firstArr.length; i++) {
                    firstArr[rows - 1] = secondNumber;
                    secondArr[rows - 1] = firstNumber;
                }
            }else  {
                firstArr[rows - 1] = firstNumber;
                secondArr[rows- 1] = secondNumber;
            }
        }
        for (int num:firstArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num:secondArr) {
            System.out.print(num + " ");
        }
    }
}
