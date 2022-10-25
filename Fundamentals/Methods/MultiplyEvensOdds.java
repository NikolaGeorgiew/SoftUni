package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt (scanner.nextLine()));

        int result = getMultipleEvenAndOdd(num);

        System.out.println(result);


    }
    public static int getMultipleEvenAndOdd(int num){
        int sumEven = getEvenSum(num);
        int sumOdd = getOddSum(num);
        int result = sumEven * sumOdd;
        return result;
    }

    public static int getEvenSum(int num) {
        String intToString = Integer.toString(num);

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }
        return evenSum;
    }

    public static int getOddSum(int numb) {
        String intToString = Integer.toString(numb);

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
