package SetsAndMapsExe;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split(" ");
        int firstSetLength = Integer.parseInt(info[0]);
        int secondSetLength = Integer.parseInt(info[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();


        for (int i = 1; i <= firstSetLength; i++) {
            int number = Integer.parseInt (scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 1; i <= secondSetLength; i++) {
            int secondNumber = Integer.parseInt (scanner.nextLine());
            secondSet.add(secondNumber);
        }
        firstSet.retainAll(secondSet);
        for (Integer integer : firstSet) {
            System.out.print(integer + " ");
        }

    }
}
