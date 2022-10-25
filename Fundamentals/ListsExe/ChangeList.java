package ListsExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            if (input.contains("Delete")){
                int element = Integer.parseInt(input.split(" ")[1]);
                numbsList.removeAll(Arrays.asList(element));
            } else if (input.contains("Insert")){
                int element1 = Integer.parseInt(input.split(" ")[1]);
                int index = Integer.parseInt(input.split(" ")[2]);
                numbsList.add(index,element1);

            }

            input = scanner.nextLine();
        }
        for (int numbs : numbsList) {
            System.out.print(numbs + " ");
        }
    }
}
