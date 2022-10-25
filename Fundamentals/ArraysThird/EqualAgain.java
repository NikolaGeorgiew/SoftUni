package ArraysThird;

import java.util.Arrays;
import java.util.Scanner;

public class EqualAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                flag = true;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if (!flag) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
