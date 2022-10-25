package TextProcessingExe;

import java.util.Scanner;

public class CaeserCypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder();

        for (int position = 0; position < input.length(); position++) {
            char symbol = input.charAt(position);
            char encryptedSymbol = (char) (symbol + 3);
            text.append(encryptedSymbol);
        }
        System.out.println(text);
    }
}
