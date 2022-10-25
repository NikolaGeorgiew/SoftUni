package ExamPreparation;

import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt (scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] matrix = new char[size][size];
        int bombs = 0;

        for (int rows = 0; rows < size; rows++) {
            matrix[rows] = scanner.nextLine().toCharArray().;
            
        }
        printMatrix(matrix);

        int sapperRow = 0;
        int sapperCol = 0;

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (matrix[r][c] == 's') {
                    sapperRow = r;
                    sapperCol = c;
                }
            }
        }
        System.out.println();

    }





    
    
    public static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
