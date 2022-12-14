package SetsAndMapsExe;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        Set<String> elements = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            String[] compound = scanner.nextLine().split(" ");
            elements.addAll(Arrays.asList(compound));
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
