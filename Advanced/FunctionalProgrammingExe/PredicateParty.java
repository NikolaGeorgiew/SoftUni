package FunctionalProgrammingExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("Party!")){
            String[] tokens = input.split(" ");
            guests = getUpdateList(guests,tokens);

            input = scanner.nextLine();
        }
        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
           System.out.printf("%s are going to the party!%n", guests.stream().sorted()
                    .collect(Collectors.joining(", ")));
        }

    }
    public static Predicate<String> getPredicate(String criteria, String subString) {
        switch (criteria) {
            case "StartsWith":
                return e -> e.startsWith(subString);
            case "EndsWith":
                return e -> e.endsWith(subString);
            case "Length":
                int length = Integer.parseInt(subString);
                return  e -> e.length() == length;
            default:
                throw new IllegalArgumentException("Unknown");
        }
    }
    public static List<String> getUpdateList(List<String> guests, String[] input) {
        String command = input[0];
        String criteria = input[1];
        String subString = input[2];
        switch (command) {
            case "Remove":
                guests = guests.stream().filter(e -> !getPredicate(criteria, subString).test(e))
                        .collect(Collectors.toList());
                return guests;
            case "Double":
                List<String> newList = new ArrayList<>(guests);
                newList.addAll(guests.stream().filter(getPredicate(criteria, subString))
                        .collect(Collectors.toList()));
                return newList;
            default:
                throw new IllegalArgumentException("Uknown");
        }
    }
}
