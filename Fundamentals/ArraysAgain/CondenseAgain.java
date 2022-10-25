package ArraysAgain;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (numbsArray.length > 1) {
            int[] cond = new  int[numbsArray.length - 1];
            for (int i = 0; i < cond.length; i++) {
                cond[i] = numbsArray[i] + numbsArray[i + 1];
            }

            numbsArray = cond;
        }
        System.out.println(numbsArray[0]);
    }
}
