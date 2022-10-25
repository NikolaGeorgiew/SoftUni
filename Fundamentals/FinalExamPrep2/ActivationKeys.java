package FinalExamPrep2;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            if (input.contains("Contains")){
                String substring = input.split(">>>")[1];
                if (activationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n",activationKey,substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (input.contains("Flip")){
                String upperOrLower = input.split(">>>")[1];
                int startIndex = Integer.parseInt(input.split(">>>")[2]);
                int endIndex = Integer.parseInt(input.split(">>>")[3]);
                String substring = activationKey.substring(startIndex,endIndex);
                if (upperOrLower.equals("Upper")){
                    activationKey = activationKey.replace(substring,substring.toUpperCase(Locale.ROOT));
                } else if (upperOrLower.equals("Lower")){
                    activationKey = activationKey.replace(substring,substring.toLowerCase(Locale.ROOT));
                }
                System.out.println(activationKey);

            } else if (input.contains("Slice")){
                int startIndex = Integer.parseInt(input.split(">>>")[1]);
                int endIndex = Integer.parseInt(input.split(">>>")[2]);
                String substring = activationKey.substring(startIndex,endIndex);
                activationKey = activationKey.replace(substring, "");

                System.out.println(activationKey);

            }


            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",activationKey);
    }
}
