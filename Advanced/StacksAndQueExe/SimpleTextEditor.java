package StacksAndQueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt (scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < commandsCount; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]){
                case "1":
                    String string = command[1];
                    builder.append(string);
                    stack.push(builder.toString());

                    break;
                case "2":
                    int length = builder.length();
                    int reduction = Integer.parseInt(command[1]);
                    builder.delete(length - reduction, length);
                    stack.push(builder.toString());

                    break;
                case "3":
                    int index = Integer.parseInt(command[1]) - 1;
                    System.out.println(builder.charAt(index));
                    break;
                case "4":
                    builder.setLength(0);
                    if (stack.size() > 1){
                        stack.pop();
                        builder.append(stack.peek());
                    }
                    break;
                default:
            }
        }
    }
}
