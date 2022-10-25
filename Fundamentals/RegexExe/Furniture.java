package RegexExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]+)!(?<quantity>[0-9]+)");

        List<String> furnitureList = new ArrayList<>();
        double moneySpent = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double currentPrice = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitureList.add(furniture);
                double moneyForCurrentFurniture = currentPrice * quantity;
                moneySpent += moneyForCurrentFurniture;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furniture : furnitureList) {
            System.out.println(furniture);
        }
        System.out.printf("Total money spend: %.2f", moneySpent);
    }
}
