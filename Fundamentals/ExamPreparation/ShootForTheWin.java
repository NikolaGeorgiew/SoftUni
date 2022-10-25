package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integerArr = Arrays
         .stream(scanner.nextLine().split(" "))
         .mapToInt(Integer::parseInt)
         .toArray();

        String input = scanner.nextLine();
        int shotTargets = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (isValidIndex(integerArr,index) ) {
                int target = integerArr[index];
                if (target != -1) {
                    shotTargets++;
                    integerArr[index] = -1;
                    register(integerArr,target);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",shotTargets);
        printArr(integerArr, " ");
        System.out.println();
    }
    public static boolean isValidIndex(int[] integerArr,int index) {
        return index >= 0 && index < integerArr.length;
    }
    public static void printArr (int[] arr,String separator) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length -1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
    public static void register(int[]integerArr, int target) {
        for (int i = 0; i < integerArr.length; i++) {
            int currentElement1 = integerArr[i];
            if (integerArr[i] != -1) {
                if (integerArr[i] > target) {
                    integerArr[i] -= target;
                } else  {
                    integerArr[i] += target;
                }
            }
        }
    }
}
