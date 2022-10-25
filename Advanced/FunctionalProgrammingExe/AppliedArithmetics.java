package FunctionalProgrammingExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number  = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        UnaryOperator<List<Integer>> functionAdd = l -> l.stream().map(e -> e +1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> functionMultiply = l -> l.stream().map(e -> e * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> functionSubtract = l -> l.stream().map(e -> e -1).collect(Collectors.toList());



        Consumer<Integer> consumer = n -> System.out.print(n + " ");


        while (!command.equals("end")){
            switch (command) {
                case "add":
                     number = functionAdd.apply(number);
                    break;
                case "multiply":
                    number = functionMultiply.apply(number);
                    break;
                case "subtract":
                    number = functionSubtract.apply(number);
                    break;
                case "print" :
                    number.forEach(consumer);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }

    }
}
