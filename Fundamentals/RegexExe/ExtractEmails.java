package RegexExe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Za-z]+[-._]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+\\b");
        Matcher matcher = pattern.matcher(input);

        //[A-Za-z]+[-._]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(.[A-Za-z]+-?[A-Za-z]+)+



        while (matcher.find()) {
            String email = matcher.group();
            System.out.println(email);
        }
    }
}
