package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] firstMatrix = new  int[rows][cols];

        for (int i = 0; i < firstMatrix.length; i++) {
            firstMatrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        int[] secondDimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int secondRows = secondDimensions[0];
        int secondCols = secondDimensions[1];
        int [][] secondMatrix = new  int[secondRows][secondCols];
        for (int i = 0; i < secondMatrix.length; i++) {
            secondMatrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }

        if (areEqual(firstMatrix,secondMatrix)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }
        for (int r = 0; r < firstMatrix.length; r++) {
            if (firstMatrix[r].length != secondMatrix[r].length){
                return false;
            }
            for (int cols = 0; cols < firstMatrix[r].length; cols++) {
                if (firstMatrix[r][cols] != secondMatrix[r][cols]){
                    return false;
                }
            }
        }
        return true;
    }
}
