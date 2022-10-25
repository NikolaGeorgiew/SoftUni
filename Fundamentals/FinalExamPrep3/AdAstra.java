package FinalExamPrep3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(#|\\|)(?<itemName>[A-Za-z ]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> itemsList = new ArrayList<>();


        int allCalories = 0;
        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int currentCalories = Integer.parseInt(matcher.group("calories"));
            allCalories += currentCalories;
            String calories = matcher.group("calories");
            itemsList.add(String.format("Item: %s, Best before: %s, Nutrition: %s",itemName,expirationDate,calories));



        }
        int daysYouCanLast = allCalories / 2000;
        if (daysYouCanLast > 0) {
            System.out.printf("You have food to last you for: %d days!%n", daysYouCanLast);
            itemsList.forEach(System.out::println);

        } else {
            System.out.printf("You have food to last you for: %d days!%n", daysYouCanLast);
        }



        //while (matcher.find()) {
        //String itemName = matcher.group("itemName");
        //String expirationDate = matcher.group("expirationDate");
        //String calories = matcher.group("calories");
        //System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",itemName,expirationDate,calories);
    //}

    }
}
