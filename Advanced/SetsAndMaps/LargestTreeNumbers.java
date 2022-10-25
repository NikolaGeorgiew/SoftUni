package SetsAndMaps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestTreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).
                sorted((n1,n2) -> n2.compareTo(n1)).collect(Collectors.toList());


        int counter = 0;
        for (int number : sorted) {
            System.out.print(number + " ");
            counter++;
            if (counter >= 3) {
                break;
            }
        }
    }
}
