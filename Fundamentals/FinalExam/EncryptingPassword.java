package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());



        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            Pattern pattern = Pattern.compile
                    ("([\\w\\W\\s\\S\\d\\D]+)>(?<password>(?<numbers>[0-9]{3})\\|(?<lowerLetters>[a-z]{3})\\|(?<upperLetters>[A-Z]{3})\\|(?<symbols>[^><]{3}))<\\1");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String numbers = matcher.group("numbers");
                String lowerLetters = matcher.group("lowerLetters");
                String upperLetters = matcher.group("upperLetters");
                String symbols = matcher.group("symbols");
                builder.append(numbers);
                builder.append(lowerLetters);
                builder.append(upperLetters);
                builder.append(symbols);
                System.out.println("Password: " + builder);
            } else {
                System.out.println("Try another password!");
            }


        }
    }
}
