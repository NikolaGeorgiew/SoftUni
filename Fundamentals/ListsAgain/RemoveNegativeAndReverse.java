package ListsAgain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numbsList.removeIf(e -> e < 0);

        if (numbsList.isEmpty()) {
            System.out.println("empty");
        }

        Collections.reverse(numbsList);
        for (int numb : numbsList) {
            System.out.print(numb + " ");
        }
    }
}
