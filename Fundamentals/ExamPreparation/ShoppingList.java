package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream((scanner.nextLine().
                        split("!"))).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")){
            String[] commands = input.split(" ");
            String typeCommand = commands[0];
            String item = commands[1];


            switch (typeCommand) {
                case "Urgent":
                    if (!groceries.contains(item)) {
                        groceries.add(0,item);
                    }
                    break;
                case "Unnecessary" :
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = commands[2];
                    if (groceries.contains(item)) {
                        groceries.set(groceries.indexOf(item),newItem);
                    }
                    break;
                case "Rearrange":
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                        groceries.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ",groceries));
    }
}
