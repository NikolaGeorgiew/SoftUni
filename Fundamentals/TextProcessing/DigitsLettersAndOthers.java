package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder isDigit = new StringBuilder();
        StringBuilder isLetters = new StringBuilder();
        StringBuilder isOthers = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)){
                isDigit.append(symbol);
            } else if (Character.isLetter(symbol)){
                isLetters.append(symbol);
            } else {
                isOthers.append(symbol);
            }
        }
        System.out.println(isDigit);
        System.out.println(isLetters);
        System.out.println(isOthers);
    }
}
