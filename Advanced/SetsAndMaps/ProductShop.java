package SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductShop {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();

        Map<String, Map<String,Double>> productsPriceMap = new HashMap<>();

        while (!info.equals("Revision")){
            String[] arr = info.split(", ");
            String shop = arr[0];
            String product = arr[1];
            double price = Double.parseDouble(arr[2]);
            if (!productsPriceMap.containsKey(shop)) {
                productsPriceMap.put(shop,new LinkedHashMap<>());
                productsPriceMap.get(shop).put(product,price);
            } else {
                productsPriceMap.get(shop).put(product,price);
            }
            info = scanner.nextLine();
        }
        productsPriceMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    System.out.printf("%s->%n",entry.getKey());
                    entry.getValue().forEach((product, price) ->
                            System.out.printf("Product: %s, Price: %.1f%n", product,price));
                });
    }
}
