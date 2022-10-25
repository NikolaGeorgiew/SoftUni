package ExamPreparation;

import java.util.Scanner;

public class BurgerBus {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cities = Integer.parseInt (scanner.nextLine());

        double totalProfit = 0;

        for (int i = 1; i <= cities; i++) {
            String nameCity = scanner.nextLine();
            double income = Double.parseDouble (scanner.nextLine());
            double expenses = Double.parseDouble (scanner.nextLine());
            double currentProfitFromCity = 0;
            if (i % 3 == 0 && i % 5 != 0) {
                expenses = expenses + expenses * 0.5;
                currentProfitFromCity = income - expenses;
                totalProfit += currentProfitFromCity;
            } else if (i % 5 == 0) {
                income = income - (income * 0.10);
                currentProfitFromCity = income - expenses;
                totalProfit += currentProfitFromCity;

            } else {
                currentProfitFromCity = income - expenses;
                totalProfit += currentProfitFromCity;
            }
            System.out.printf("In %s Burger Bus earned %.2f leva.%n",nameCity,currentProfitFromCity);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.",totalProfit);

    }
}
