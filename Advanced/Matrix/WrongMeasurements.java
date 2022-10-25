package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt (scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int valueToReplace = matrix[dimensions[0]][dimensions[1]];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == valueToReplace) {
                }
            }
        }

    }
    public static int getNearbySym(int[][] matrix, int r, int c) {
        int sum = 0;
        if (isInBounds(matrix,r,c)) {
            sum += matrix[r +1] [c];
        }
        sum += matrix[r +1] [c];
        sum += matrix[r-1][c];
        sum += matrix[r][c+1];
        sum += matrix[r][c-1];

        return sum;
    }
    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >=  0 && c < matrix[r].length;
    }
}
