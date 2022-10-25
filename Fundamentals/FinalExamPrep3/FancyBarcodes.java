package FinalExamPrep3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("([@][#]+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])[@][#]+");
            Matcher matcher = pattern.matcher(input);
            if (!matcher.find()){
                System.out.println("Invalid barcode!");
            } else {
                while (matcher.find()) {
                    StringBuilder builder = new StringBuilder();
                    String barcode = matcher.group("barcode");
                    for (char symbol : barcode.toCharArray()) {
                        if (Character.isDigit(symbol)){
                            builder.append(symbol);
                        }
                    }
                    if (builder.isEmpty()) {
                        builder.append("00");
                    }
                    System.out.println("Product group: " + builder);
                }
            }

        }

    }
}
