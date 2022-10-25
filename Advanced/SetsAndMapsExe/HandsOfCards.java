package SetsAndMapsExe;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, HashSet<String>> map = new LinkedHashMap<>();



        while (!input.equals("JOKER")) {
            String[] arr = input.split(": ");
            String name = arr[0];
            String cardsInfo = arr[1];
            String[] card = cardsInfo.split(", ");
            if (!map.containsKey(name)) {
                map.put(name,new HashSet<>());
            }
            Collections.addAll(map.get(name), card);

            input = scanner.nextLine();
        }
        for (var player : map.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());
            System.out.printf("%s: %d%n",name,points);
        }

    }

    private static int calculatePoints(HashSet<String> value) {
        int points = 0;
        for (String card : value) {
            String power = card.substring(0, card.length() - 1);
            String color = card.substring(card.length() -1);
            int cardPoints = getPowerPoints(power) * getColorPoints(color);
            points += cardPoints;
        }
        return points;
    }

    private static int getColorPoints(String color) {
        switch (color) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
        }
        return 1;
    }

    private static int getPowerPoints(String power) {
        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
        }
        return 0;
    }
}
