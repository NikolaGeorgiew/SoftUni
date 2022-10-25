package DefiningClasses;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,BankAccount> bankAccounts;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] data = input.split(" ");
            String command = data[0];
            bankAccounts = new HashMap<>();
            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    bankAccounts.put(account.getId(),account);
                    System.out.println("Account: ID" + account.getId() + " created");
                    break;
                case "Deposit":
                    int id = Integer.parseInt(data[1]);
                    double amount = Double.parseDouble(data[2]);
                    deposit(id,amount);
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(data[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int interestId = Integer.parseInt(data[1]);
                    int years = Integer.parseInt(data[2]);
                    break;
                default:
                    break;
            }

            input = scanner.nextLine();
        }
    }
    private static void deposit(int id,double amount) {
        try {
            BankAccount account = bankAccounts.get(id);
            account.deposit(amount);
            System.out.println("Deposited " + amount + " to ID" + id);
        } catch (NullPointerException e) {
            System.out.println("Account does not exist");
        }
    }
    private static void getInterest(int id, int years) {
        BankAccount account = bankAccounts.get(id);
         double sum = account.getInterest(years);
        System.out.printf("%.2f%n",sum);

    }

}
