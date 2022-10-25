package ArraysExee;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int n = Integer.parseInt (scanner.nextLine());

        for (int rotations = 1; rotations <= n; rotations++) {
            String firstElement = inputArr[0];
            for (int index = 0; index < inputArr.length - 1; index++) {
                inputArr[index] = inputArr[index + 1];
            }
            inputArr[inputArr.length - 1] = firstElement;
        }

        for (String num: inputArr) {
            System.out.print(num + " ");
        }
    }
}
