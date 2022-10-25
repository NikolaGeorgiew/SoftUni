package DataTypesMore;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble (scanner.nextLine());

        double balance = money;

        double totalSpent = 0;
        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {
            if (balance == 0) {
                System.out.println("Out of money!");
                return;
            }


            if (input.equals("OutFall 4") && balance >= 39.99){
                balance = balance - 39.99;
                totalSpent += 39.99;
                System.out.println("Bought OutFall 4");
            } else if (input.equals("CS: OG") && balance >= 15.99){
                balance = balance - 15.99;
                totalSpent += 15.99;
                System.out.println("Bought CS: OG");
            }else if (input.equals("Zplinter Zell") && balance >= 19.99){
                balance = balance - 19.99;
                totalSpent += 19.99;
                System.out.println("Bought Zplinter Zell");
            }else if (input.equals("Honored 2") && balance >= 59.99) {
                balance = balance - 59.99;
                totalSpent += 59.99;
                System.out.println("Bought Honored 2");
            } else if (input.equals("RoverWatch") && balance >= 29.99){
                balance = balance - 29.99;
                totalSpent += 29.99;
                System.out.println("Bought RoverWatch");
            } else if (input.equals("RoverWatch Origins Edition") && balance >= 39.99){
                balance = balance - 39.99;
                totalSpent += 39.99;
                System.out.println("Bought RoverWatch Origins Edition");
            } else  if (!input.equals("Outfall 4") && !input.equals("CS: OG") && !input.equals("Zplinter Zell") &&
                    !input.equals("Honored 2") && !input.equals("RoverWatch")&& !input.equals("RoverWatch Origins Edition")){
                System.out.println("Not Found");
            } else {
                System.out.println("Too Expensive");
            }

            input = scanner.nextLine();
        }
        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, money - totalSpent);
        } else {
            System.out.println("Out of money!");
        }

    }
}
