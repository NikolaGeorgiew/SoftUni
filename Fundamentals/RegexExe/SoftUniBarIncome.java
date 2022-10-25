package RegexExe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalIncome = 0;

        while (!input.equals("end of shift")){
            Pattern pattern = Pattern.compile("%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<productCount>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$");
            Matcher matcher = pattern.matcher(input);
            double totalPrice = 0;
            while (matcher.find()){
                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int productCount = Integer.parseInt(matcher.group("productCount"));
                double price = Double.parseDouble(matcher.group("price"));
                totalPrice = price * productCount;
                totalIncome += totalPrice;
                System.out.printf("%s: %s - %.2f%n",customerName,product,totalPrice);

            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f%n",totalIncome);
    }
}
