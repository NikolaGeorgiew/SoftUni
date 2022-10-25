package FinalExam;

import java.util.Scanner;

public class StringGame {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String commands = scanner.nextLine();

        while (!commands.equals("Done")){
            if (commands.contains("Change")){
                String symbol = commands.split(" ")[1];
                String replacement = commands.split(" ")[2];
                input = input.replace(symbol,replacement);

                System.out.println(input);

            } else if (commands.contains("Includes")){
                String substring = commands.split(" ")[1];
                if (input.contains(substring)){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (commands.contains("End")){
                String substring = commands.split(" ")[1];
                if (input.endsWith(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }


            } else if (commands.contains("Uppercase")){
                input = input.toUpperCase();
                System.out.println(input);

            } else if (commands.contains("FindIndex")){
                String occurence = commands.split(" ")[1];
                char symbolOccurence = occurence.charAt(0);
                for (int i = 0; i < input.length(); i++) {
                    char symbol = input.charAt(i);
                    if (symbol == symbolOccurence) {
                        System.out.println(i);
                        break;
                    }
                }
            } else if (commands.contains("Cut")){
                int startIndex = Integer.parseInt(commands.split(" ")[1]);
                int count = Integer.parseInt(commands.split(" ")[2]);
                String substring = input.substring(startIndex,startIndex + count);
                String startingSubstring = input.substring(0,startIndex);
                String endindSubString = input.substring(startIndex + count, input.length());
                input = input.replace(startingSubstring, "");
                input = input.replace(endindSubString, "");

                System.out.println(input);

            }


            commands = scanner.nextLine();
        }
    }
}
