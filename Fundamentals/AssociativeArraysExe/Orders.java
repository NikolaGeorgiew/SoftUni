package AssociativeArraysExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String,Double> mapPrices = new LinkedHashMap<>();

        Map<String,Integer> mapQuantity = new LinkedHashMap<>();
        while (!command.equals("buy")){
            String product = command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);
            double totalPrice = price * quantity;
            if (!mapQuantity.containsKey(product)){
                mapQuantity.put(product,quantity);
            }
            if (!mapPrices.containsKey(product)) {
                mapPrices.put(product,totalPrice);
            } else {
                int newQuantity = mapQuantity.get(product) + quantity;
                double newPrice = newQuantity * price;
                mapPrices.put(product,newPrice);

            }

            command = scanner.nextLine();
        }
        mapPrices.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
}
