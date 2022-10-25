package FunctionalProgrammingExe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Predicate<String> predicate = name -> name.length() <= n;
        names.stream().filter(predicate)
                .forEach(System.out::println);


    }
}