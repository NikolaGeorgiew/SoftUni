package DataTypesMore;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String result = "";

        for (int i = text.length() - 1; i >= 0 ; i--) {
            result = result + text.charAt(i);
        }
        System.out.println(result);
    }
}
