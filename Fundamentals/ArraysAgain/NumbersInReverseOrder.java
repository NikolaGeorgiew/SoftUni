package ArraysAgain;

import java.util.Scanner;

public class NumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());

        int[] numbArray = new int[n];

        for (int i = 0; i < numbArray.length; i++) {
            int numb = Integer.parseInt (scanner.nextLine());
            numbArray[i] = numb;
        }
        for (int i = numbArray.length - 1; i >= 0 ; i--) {
            System.out.print(numbArray[i] + " ");
        }
    }
}
