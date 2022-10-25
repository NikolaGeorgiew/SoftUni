package FunctionalProgrammingExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        IntPredicate predicate = e -> {
            for (Integer number : numbsList) {
                if (e % number != 0){
                    return false;
                }
            }
            return true;
        };
        IntStream.rangeClosed(1,n).filter(predicate)
                .forEach(e -> System.out.print(e + " "));
    }
}
