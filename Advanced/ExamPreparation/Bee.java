package ExamPreparation;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prochitam matrix
        //namiram kude e Bee
        //dvija se v matrix
        //ako stupq na flower ili bonus

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = scanner.nextLine().toCharArray();

        }
        int beeRow = -1;
        int beeCol = -1;

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (matrix[r][c] == 'B') {
                    beeRow = r;
                    beeCol = c;
                }
            }
        }
        String command = scanner.nextLine();
        int flowers = 0;
        while (!command.equals("End")) {
            matrix[beeRow][beeCol] = '.';
            if (command.equals("up") && beeRow > 0) {
                beeRow--;
            } else if (command.equals("down") && beeRow < size - 1) {
                beeRow++;
            } else if (command.equals("right") && beeCol < size - 1) {
                beeCol++;
            } else if (command.equals("left") && beeCol > 0) {
                beeCol--;
            } else {
                System.out.println("The bee got lost!");
                matrix[beeRow][beeCol] = '.';
                break;
            }

            if (matrix[beeRow][beeCol] == 'f') {
                flowers++;
                matrix[beeRow][beeCol] = '.';

            } else if (matrix[beeRow][beeCol] == 'O') {
                matrix[beeRow][beeCol] = '.';
                continue;
            }


            matrix[beeRow][beeCol] = 'B';

            command = scanner.nextLine();

        }
        System.out.println();
        if (flowers >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n",flowers);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n",5 - flowers);
        }
        printMatrix(matrix);

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
