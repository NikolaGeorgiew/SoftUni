package PregovorExe;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        boolean flag = false;

        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                flag = true;
                System.out.printf("Cannot accept %.2f", coins);
            }
            if (flag) {
                break;
            }else {
                sum += coins;
            }

            input = scanner.nextLine();
        }
        while (!input.equals("End")){
            if (!input.equals("Start") && !flag && !input.equals("Nuts") && !input.equals("Water") && !input.equals("Crisps") && !input.equals("Soda") && !input.equals("Coke")) {
                System.out.println("Invalid product");
            }

            if (input.equals("Nuts") && sum < 2.0) {
                System.out.println("Sorry, not enough money");
            }else if (input.equals("Nuts") && sum >= 2.00){
                System.out.println("Purchased Nuts");
                sum = sum - 2.0;
            }

            if (input.equals("Water") && sum < 0.7){
                System.out.println("Sorry, not enough money");
            } else if (input.equals("Water") && sum >= 0.7){
                System.out.println("Purchased Water");
                sum = sum -0.7;
            }

            if (input.equals("Crisps") && sum < 1.5){
                System.out.println("Sorry, not enough money");
            } else if (input.equals("Crisps") && sum >= 1.5){
                System.out.println("Purchased Crisps");
                sum = sum - 1.5;
            }

            if (input.equals("Soda") && sum < 0.8){
                System.out.println("Sorry, not enough money");
            }else if (input.equals("Soda") && sum >= 0.8) {
                System.out.println("Purchased Soda");
                sum = sum - 0.8;
            }

            if (input.equals("Coke") && sum < 1.0) {
                System.out.println("Sorry, not enough money");
            }else if (input.equals("Coke") && sum >= 1.00) {
                System.out.println("Purchased Coke");
                sum = sum - 1;
            }


            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);

    }
}
