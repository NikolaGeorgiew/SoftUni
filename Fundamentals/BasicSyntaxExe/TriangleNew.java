package PregovorExe;

import java.util.Scanner;

public class TriangleNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());
        int currentNumber = 1;
        int countRedove = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                currentNumber = countRedove;
                System.out.printf("%d ", currentNumber);

            }
            countRedove++;
            System.out.println();
        }
    }
}
