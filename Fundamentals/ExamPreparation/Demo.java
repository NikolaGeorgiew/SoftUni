package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
         .stream(scanner.nextLine().split("\\s+"))
         .mapToInt(Integer::parseInt)
         .toArray();

        //System.out.println(isValidIndex(integerArr,index));


        printArr(arr,"@");

    //public static boolean isValidIndex(int[] arr, int index) {
        //return index >= 0 && index <= arr.length -1;
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
}
