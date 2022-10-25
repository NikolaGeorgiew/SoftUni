package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numbList.removeIf(e -> e <0);
        Collections.reverse(numbList);

        if (numbList.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int numb: numbList) {
                System.out.print(numb + " ");
            }
        }
    }
}
