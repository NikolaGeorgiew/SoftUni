package MatrixExe;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int bestStartRow = 0;
        int bestStartCol = 0;
        for (int r = 0; r < matrix.length -2; r++) {
            for (int c = 0; c < matrix[r].length -2; c++) {
                sum = matrix[r][c] + matrix[r] [c+1] + matrix[r][c+2]
                      + matrix[r+1][c] + matrix[r+1][c + 1] + matrix[r+1][c+2]
                      + matrix[r+2][c] + matrix[r+2][c+1] + matrix[r+2][c+2];
                if (sum > maxSum) {
                    maxSum = sum;
                    bestStartRow = r;
                    bestStartCol = c;

                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int r = bestStartRow; r < bestStartRow + 3; r++) {
            for (int c = bestStartCol; c < bestStartCol + 3; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
