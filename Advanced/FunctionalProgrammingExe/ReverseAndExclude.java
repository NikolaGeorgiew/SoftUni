package FunctionalProgrammingExe;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt (scanner.nextLine());

        Collections.reverse(numbsList);
        numbsList.stream()
                .filter(e -> e % n != 0)
                .forEach(e -> System.out.print(e + " "));
    }
}
