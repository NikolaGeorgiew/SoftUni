package FinalExamPrep3;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        String commands = scanner.nextLine();

        while (!commands.equals("Decode")){
            if (commands.contains("Move")){
                int numberOfLetters = Integer.parseInt(commands.split("\\|")[1]);
                String substring = encryptedMessage.substring(0,numberOfLetters);
                 encryptedMessage = encryptedMessage.replace(substring, "");
                StringBuilder messageBuilder = new StringBuilder(encryptedMessage);
                messageBuilder.append(substring);
                encryptedMessage = messageBuilder.toString();


            } else if (commands.contains("Insert")){
                int index = Integer.parseInt(commands.split("\\|")[1]);
                String value = commands.split("\\|")[2];
                StringBuilder messageBuilder = new StringBuilder(encryptedMessage);
                messageBuilder.insert(index,value);
                encryptedMessage = messageBuilder.toString();

            } else if (commands.contains("ChangeAll")){
                String substring = commands.split("\\|")[1];
                String replacement = commands.split("\\|")[2];
                 encryptedMessage = encryptedMessage.replace(substring,replacement);
            }


            commands = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",encryptedMessage);
    }
}
