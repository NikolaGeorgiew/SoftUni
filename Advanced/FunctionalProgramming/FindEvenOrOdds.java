package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvenOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int beginIndex = Integer.parseInt(data[0]);
        int finalIndex = Integer.parseInt(data[1]);

        String command = scanner.nextLine();

        IntPredicate filter = i -> command.equals("even") == (i % 2 == 0);

        System.out.println(IntStream.rangeClosed(beginIndex, finalIndex)
                .filter(filter)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
