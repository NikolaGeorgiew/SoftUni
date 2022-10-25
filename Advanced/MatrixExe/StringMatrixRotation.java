package MatrixExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotation = scanner.nextLine();
        String rotationString = rotation.split("[()]")[1];
        int rotationNumber = Integer.parseInt(rotationString);
        int angleOfRotation = rotationNumber % 360;
        String input = scanner.nextLine();

        List<String> wordList = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;
        while (!input.equals("END")){
            wordList.add(input);
            if (input.length() >= maxLength) {
                maxLength = input.length();
            }

            input = scanner.nextLine();
        }
        int rows = wordList.size();
        int cols = maxLength;
        char[][] matrix = new char[rows][cols];
        for (int r = 0; r < matrix.length; r++) {
            String currentWord = wordList.get(r);
            for (int c = 0; c < matrix[r].length; c++) {
                if (c >= currentWord.length()) {
                    matrix[r][c] = ' ';
                } else {
                    char currentChar = currentWord.charAt(c);
                    matrix[r][c] = currentChar;
                }
            }
        }

        switch (angleOfRotation) {
            case 0 :
                for (char[] arr : matrix) {
                    for (char element : arr) {
                        System.out.print(element);
                    }
                    System.out.println();
                }
                break;
            case 90 :
                for (int c = 0; c < cols; c++) {
                    for (int r = rows - 1; r >= 0 ; r--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int r = rows -1; r >= 0 ; r--) {
                    for (int c = cols - 1; c >= 0 ; c--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int c = cols -1; c >= 0 ; c--) {
                    for (int r = 0; r < rows; r++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
