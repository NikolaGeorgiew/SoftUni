package MatrixExe;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt (scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int primaryDiagonalSum = getPrimaryDiagonalSum(matrix);

        int secondaryDiagonalSum = getSecondaryDiagonalSum(size, matrix);
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }

    private static int getSecondaryDiagonalSum(int size, int[][] matrix) {
        int secondaryDiagonalSum = 0;
        for (int row = size - 1, col = 0; row >= 0 && col < size; col++, row--) {
            secondaryDiagonalSum += matrix[row][col];
        }
        return secondaryDiagonalSum;
    }

    private static int getPrimaryDiagonalSum(int[][] matrix) {
        int primaryDiagonalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    primaryDiagonalSum += matrix[row][col];
                }
            }
        }
        return primaryDiagonalSum;
    }
}
