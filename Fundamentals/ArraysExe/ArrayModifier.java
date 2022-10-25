package ArraysExe;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String commandType = input.split(" ")[0];
            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(input.split(" ")[1]);
                    int index2 = Integer.parseInt(input.split(" ")[2]);

                    int index1Element = array[index1];
                    int index2Element = array[index2];

                    array[index1] = index2Element;
                    array[index2] = index1Element;
                    break;
                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(input.split(" ")[1]);
                    int multiplyIndex2 = Integer.parseInt(input.split(" ")[2]);

                    int multiplyElement1 = array[multiplyIndex1];
                    int multiplyElement2 = array[multiplyIndex2];
                    int result = multiplyElement1 * multiplyElement2;

                    array[multiplyIndex1] = result;
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        int currentElement = array[i];
                        array[i] = array[i] - 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i <array.length ; i++) {
            int currentElement = array[i];
            if (i != array.length -1) {
                System.out.print(currentElement + ", ");
            } else {
                System.out.println(currentElement);
            }
        }
    }
}
