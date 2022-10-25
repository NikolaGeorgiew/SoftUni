package MatrixExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");

        }
        String secondInput = scanner.nextLine();
        while (!secondInput.equals("END")) {
           // List<String> coordinatesList = Arrays.stream(secondInput.split(" ")).collect(Collectors.toList());
            String[] coordinates = secondInput.split(" ");
            String command = coordinates[0];
            if (!command.equals("swap") || coordinates.length != 5) {
                System.out.println("Invalid input!");
            } else {
                int elementRowToChange = Integer.parseInt(coordinates[1]);
                int elementColToChange = Integer.parseInt(coordinates[2]);
                int newElementRow = Integer.parseInt(coordinates[3]);
                int newElementCol = Integer.parseInt(coordinates[4]);
                if (isOutOfBounds(matrix,elementRowToChange,elementColToChange) || isOutOfBounds(matrix,newElementRow,newElementCol)){
                    System.out.println("Invalid input!");
                    secondInput = scanner.nextLine();
                    continue;
                }

                String lastElement = matrix[elementRowToChange][elementColToChange];
                matrix[elementRowToChange][elementColToChange] = matrix[newElementRow][newElementCol];
                matrix[newElementRow][newElementCol] = lastElement;
                printMatrix(matrix);


                secondInput = scanner.nextLine();
            }
        }
    }
    private static boolean isInBounds(String[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >=  0 && c < matrix[r].length;
    }
    private static boolean isOutOfBounds(String[][] matrix, int r, int c) {
        return !isInBounds(matrix,r,c);
    }
    private static void printMatrix(String[][] matrix){
        for (String[] arr : matrix) {
            for (String element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
