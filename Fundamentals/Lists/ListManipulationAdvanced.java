package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String typeCommand = commandLine.get(0);
            switch (typeCommand) {
                case "Contains":
                    int number = Integer.parseInt(commandLine.get(1));
                    if (numbsList.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":

                    String evenOrOdd = commandLine.get(1);

                    if (evenOrOdd.equals("even")) {
                        for (int i = 0; i < numbsList.size(); i++) {
                            int currentElement = numbsList.get(i);
                            if (currentElement % 2 == 0) {
                                System.out.print(currentElement + " ");
                            }
                    }
                        System.out.println();
                    } else if (evenOrOdd.equals("odd")){
                        for (int i = 0; i < numbsList.size(); i++) {
                            int currentElement = numbsList.get(i);
                            if (currentElement % 2 != 0) {
                                System.out.print(currentElement + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    String findSum = commandLine.get(1);

                    int sum = 0;
                    for (int i = 0; i < numbsList.size(); i++) {
                        int currentElement = numbsList.get(i);
                        sum += currentElement;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    char cond = condition.charAt(0);
                    int number1 = Integer.parseInt(commandLine.get(2));

                    switch (condition) {
                        case "<":
                            for (int i = 0; i <numbsList.size(); i++) {
                                int currentElement = numbsList.get(i);
                                if (currentElement < number1) {
                                    System.out.print(currentElement + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbsList.size(); i++) {
                                int currentElement = numbsList.get(i);
                                if (currentElement > number1){
                                    System.out.print(currentElement + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbsList.size(); i++) {
                                int currentElement = numbsList.get(i);
                                if (currentElement >= number1) {
                                    System.out.print(currentElement + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbsList.size(); i++) {
                                int currentElement = numbsList.get(i);
                                if (currentElement <= number1) {
                                    System.out.print(currentElement + " ");
                                }
                            }
                            System.out.println();
                            break;

                    }

                    break;

            }




            input = scanner.nextLine();
        }
    }
}
