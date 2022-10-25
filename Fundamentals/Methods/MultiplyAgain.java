package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyAgain {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt (scanner.nextLine()));

        System.out.println(MultipleSum(n));


    }
    public static int MultipleSum(int num) {
        int evenSum = evenSum(num);
        int oddSum = oddSum(num);
        int result = evenSum * oddSum;
        return result;
    }
    public static int evenSum(int num) {
        String intToString = Integer.toString(num);
        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                evenSum += arr[i];
            }
        }
        return evenSum;
    }
    public static int oddSum(int num) {
        String intToString = Integer.toString(num);
        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddSum += arr[i];
            }
        }
        return oddSum;
    }
}
