package FunctionalProgrammingExe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = (first,second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0){
                return 1;
            }
            return first.compareTo(second);
        };
        numbsList.sort(comparator);
        numbsList.forEach(e -> System.out.print(e + " "));
    }
}
