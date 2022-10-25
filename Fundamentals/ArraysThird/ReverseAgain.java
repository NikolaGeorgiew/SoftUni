package ArraysThird;

import java.util.Scanner;

public class ReverseAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for (int i = 0; i < array.length / 2; i++) {
            String oldElement = array[0 + i];
            array[0 + i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = oldElement;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
