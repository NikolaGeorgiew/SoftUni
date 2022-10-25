package MethodsExe;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());
        matrix(n);

    }
    private static void matrix(int numb) {
        for (int i = 0; i < numb; i++) {
            for (int j = 0; j < numb; j++) {
                System.out.print(numb + " ");
            }
            System.out.println();
        }
    }
}
