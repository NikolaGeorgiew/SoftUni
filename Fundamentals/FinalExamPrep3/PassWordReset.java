package FinalExamPrep3;

import java.util.Scanner;

public class PassWordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        String commands = scanner.nextLine();

        while (!commands.equals("Done")) {
            if (commands.contains("TakeOdd")){
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < inputLine.length(); i++) {
                    if (i % 2 != 0) {
                        builder.append(inputLine.charAt(i));
                    }
                }
                inputLine = builder.toString();
                System.out.println(inputLine);
            } else if (commands.contains("Cut")){
                int index = Integer.parseInt(commands.split(" ")[1]);
                int length = Integer.parseInt(commands.split(" ")[2]);
                String substring = inputLine.substring(index, index + length);
                StringBuilder builder = new StringBuilder(inputLine);
                builder.delete(index, index + length);
                inputLine = builder.toString();
                System.out.println(inputLine);

            } else if (commands.contains("Substitute")){
                String substring = commands.split(" ")[1];
                String substitute = commands.split(" ")[2];
                if (inputLine.contains(substring)){
                    inputLine = inputLine.replace(substring, substitute);
                    System.out.println(inputLine);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            commands = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", inputLine);
    }
}
