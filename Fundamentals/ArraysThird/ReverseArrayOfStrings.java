package ArraysThird;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[0 + i];
            inputArr[0 + i] = inputArr[inputArr.length - 1- i];
            inputArr[inputArr.length- 1 - i] = oldElement;

        }
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + " ");
        }
    }
}
