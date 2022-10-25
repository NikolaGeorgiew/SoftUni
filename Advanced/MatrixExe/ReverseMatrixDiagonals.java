package MatrixExe;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        int startRow = rows - 1;
        int startCol = cols - 1;

        while (startRow >= 0) {
            int r = startRow;
            int c = startCol;
            while (c < cols && r >= 0) {
                System.out.print(matrix[r][c] + " ");
                c++;
                r--;
            }
            System.out.println();
            startCol--;
            if (startCol < 0) {
                startCol = 0;
                startRow--;
            }
        }
    }
}
