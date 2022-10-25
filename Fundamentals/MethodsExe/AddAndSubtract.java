package MethodsExe;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt (scanner.nextLine());
        int num2 = Integer.parseInt (scanner.nextLine());
        int num3 = Integer.parseInt (scanner.nextLine());

        int result = sumFirstTwo(num1,num2) - num3;
        System.out.println(result);

    }
    private static int sumFirstTwo(int n1,int n2) {
        int result = n1 + n2;
        return result;

    }
}
