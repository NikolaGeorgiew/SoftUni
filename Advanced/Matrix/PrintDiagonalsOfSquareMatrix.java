package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt (scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }

        int rows = 0;
        int cols = 0;
        while (rows < matrix.length && cols < matrix[rows].length) {
            System.out.print(matrix[rows][cols] + " ");
            rows++;
            cols++;
        }
        System.out.println();
        rows = matrix.length - 1;
        cols = 0;
        while (rows >= 0 && cols < matrix[rows].length){
            System.out.print(matrix[rows][cols] + " ");
            rows--;
            cols++;
        }
    }
}
