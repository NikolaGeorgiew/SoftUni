package ListsExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt (scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            if (input.contains("Add")){
                int passengers = Integer.parseInt(input.split(" ")[1]);
                numbsList.add(passengers);

            } else {
                int passengers1 = Integer.parseInt(input);
                for (int i = 0; i < numbsList.size(); i++) {
                    int currentElement = numbsList.get(i);
                    if (currentElement + passengers1 <= maxCapacity) {
                        numbsList.set(i,currentElement + passengers1);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (int passengers : numbsList) {
            System.out.print(passengers + " ");
        }
    }
}
