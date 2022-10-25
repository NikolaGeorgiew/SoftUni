package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String commandType = commandLine.get(0);
            switch (commandType) {
                case "Add":
                    int number = Integer.parseInt(commandLine.get(1));
                    numberList.add(number);
                    break;
                case "Remove":
                    int number1 = Integer.parseInt(commandLine.get(1));
                    numberList.remove(Integer.valueOf(number1));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandLine.get(1));
                    numberList.remove(index);
                    break;
                case "Insert":
                    int number2 = Integer.parseInt(commandLine.get(1));
                    int index1 = Integer.parseInt(commandLine.get(2));
                    numberList.add(index1,number2);
                    break;

            }
            input = scanner.nextLine();
        }
        for (int numb: numberList) {
            System.out.print(numb + " ");
        }
    }
}
