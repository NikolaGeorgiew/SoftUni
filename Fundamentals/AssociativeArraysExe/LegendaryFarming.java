package AssociativeArraysExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();


        boolean isObtained = false;
        String input = scanner.nextLine();
        while (!isObtained) {
            String[] inputData = input.split(" ");
            for (int index = 0; index < inputData.length; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int value = items.get(material);
                    items.put(material, quantity + value);
                    if (items.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        int currentValue = items.get(material);
                        currentValue = currentValue - 250;
                        items.put(material,currentValue);
                        isObtained = true;
                        break;
                    } else if (items.get("fragments") >= 250) {
                        System.out.println("Valanyr obtained!");
                        int currentValue = items.get(material);
                        currentValue = currentValue - 250;
                        items.put(material,currentValue);
                        isObtained = true;
                        break;
                    } else if (items.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        int currentValue = items.get(material);
                        currentValue = currentValue - 250;
                        items.put(material,currentValue);
                        isObtained = true;
                        break;
                    }
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int value = junk.get(material);
                        junk.put(material, value + quantity);

                    }
                }
            }
            if (!isObtained) {
                input = scanner.nextLine();
            }
        }
        items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
