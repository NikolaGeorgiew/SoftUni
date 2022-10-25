package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt (scanner.nextLine());
        switch (product) {
            case "coffee":
                printResult(1.50,quantity);
                break;
            case "water":
                printResult(1.00,quantity);
                break;
            case "coke":
                printResult(1.40,quantity);
                break;
            case "snacks":
                printResult(2,quantity);
                break;
        }

    }
    public static void printResult(double price, double quantity) {
        double result = price * quantity;
        System.out.printf("%.2f",result);
    }
}
