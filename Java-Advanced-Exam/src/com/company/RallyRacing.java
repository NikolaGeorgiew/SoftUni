package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt (scanner.nextLine());
        String racingNumber = scanner.nextLine();

        String[][] matrix = new String[size][size];
        int firstTunnelRow = -1;
        int firstTunnelCol = -1;

        int secondTunnelRow = -1;
        int secondTunnelCol = -1;
        boolean isFoundFirst = false;
        boolean isReachedEnd = false;

        for (int i = 0; i < size; i++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" ")).map(e-> e.charAt(0))
                    .collect(Collectors.toList());
            for (int j = 0; j < characterList.size(); j++) {
                String currentChar = characterList.get(j).toString();
                if (currentChar.equals("T") && !isFoundFirst){
                    firstTunnelRow = i;
                    firstTunnelCol = j;
                    isFoundFirst = true;
                } else if (currentChar.equals("T") && isFoundFirst){
                    secondTunnelRow =i;
                    secondTunnelCol = j;
                }
                matrix[i][j] = currentChar;
            }

        }

        int raceCarRow = 0;
        int raceCarCol = 0;
        int kilometers = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            if (command.equals("up")){
                raceCarRow--;
                kilometers += 10;
            } else if (command.equals("down")){
                raceCarRow++;
                kilometers += 10;
            } else if (command.equals("left")){
                raceCarCol--;
                kilometers += 10;
            } else if (command.equals("right")){
                raceCarCol++;
                kilometers += 10;
            }

            if (matrix[raceCarRow][raceCarCol].equals("T")) {
                matrix[raceCarRow][raceCarCol] = ".";
                raceCarRow = secondTunnelRow;
                raceCarCol = secondTunnelCol;
                matrix[raceCarRow][raceCarCol] = ".";
                kilometers += 20;
            } else if (matrix[raceCarRow][raceCarCol].equals("F")){
                matrix[raceCarRow][raceCarCol] = "C";
                System.out.printf("Racing car %s finished the stage!%n",racingNumber);
                isReachedEnd = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (!isReachedEnd) {
            matrix[raceCarRow][raceCarCol] = "C";
            System.out.printf("Racing car %s DNF.%n",racingNumber);
        }
        System.out.printf("Distance covered %d km.%n",kilometers);

        printMatrix(matrix);







    }
    public static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
