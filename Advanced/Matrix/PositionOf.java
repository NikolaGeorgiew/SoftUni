package Matrix;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main (String[] args ){
        Scanner scanner = new Scanner (System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[rows][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        int searchNumber = Integer.parseInt (scanner.nextLine());

        boolean isFound = false;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                if (matrix[r][c] == searchNumber) {
                    isFound = true;
                    System.out.println(r + " " + c);
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }

    }
}
