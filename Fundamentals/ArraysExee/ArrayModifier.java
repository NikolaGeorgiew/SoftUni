package ArraysExee;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commands = input.split(" ");
            String typeOfCommand = commands[0];

            switch (typeOfCommand) {
                case "swap" :
                    int index1 = Integer.parseInt(commands[1]);
                    int index1Element = inputArr[index1];

                    int index2 = Integer.parseInt(commands[2]);
                    int index2Element = inputArr[index2];

                    inputArr[index1] = index2Element;
                    inputArr[index2] = index1Element;

                    break;
                case "multiply":
                    int multiplyIndex = Integer.parseInt(commands[1]);
                    int elementMultiplyIndex = inputArr[multiplyIndex];

                    int multiplyIndex2 = Integer.parseInt(commands[2]);
                    int elementMultiplyIndex2 = inputArr[multiplyIndex2];

                    int product = elementMultiplyIndex * elementMultiplyIndex2;
                    inputArr[multiplyIndex] = product;

                    break;
                case "decrease":
                    for (int index = 0; index <= inputArr.length - 1; index++) {
                        inputArr[index] = inputArr[index] - 1;

                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i <= inputArr.length - 1; i++) {
            if (i != inputArr.length - 1) {
                System.out.print(inputArr[i] + ", ");
            } else {
                System.out.print(inputArr[i]);
            }
        }
    }
}
