package PregovorExe;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumb = Integer.parseInt (scanner.nextLine());
        int endNumb = Integer.parseInt (scanner.nextLine());

        int sum = 0;

        for (int i = firstNumb; i <= endNumb; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
