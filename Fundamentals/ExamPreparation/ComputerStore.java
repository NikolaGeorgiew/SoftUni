package ExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        double sum = 0;
        double taxes = 0;
        while (!input.equals("special") && !input.equals("regular")){
            double currentNumb = Double.parseDouble(input);
            if (currentNumb < 0) {
                System.out.println("Invalid price!");
            } else {
                taxes += currentNumb * 0.2;
                sum += currentNumb;
            }
            input = scanner.nextLine();
        }
        double finalPrice = sum + taxes;
        boolean flag = false;
        if (finalPrice == 0) {
            System.out.println("Invalid order!");
            flag = true;
        }


        if (input.equals("special")){
            finalPrice = finalPrice * 0.90;
        }

        if (!flag) {


            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", finalPrice);
        }
    }
}
