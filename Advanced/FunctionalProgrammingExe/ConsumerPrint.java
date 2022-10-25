package FunctionalProgrammingExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<List<String>> consumer = elements -> elements.forEach(System.out::println);

        consumer.accept(list);




    }
}
