package MatrixExe;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int rows = size;
        int cols = size;

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")){
            patternA(rows, cols, matrix);

        } else {
            pattternB(rows, cols, matrix);
        }
        for (int[] arr: matrix) {
            for (int element: arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }





    }

    private static void pattternB(int rows, int cols, int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = rows - 1; row >= 0 ; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
            }
    }

    private static void patternA(int rows, int cols, int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }
}
