package PregovorExe;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt (scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;
        double discountPrice = 0;

        switch (day) {
            case "Friday":
                if (type.equals("Students")){
                    totalPrice = countPeople * 8.45;
                    if (countPeople >= 30) {
                        totalPrice = totalPrice - (totalPrice * 0.15);
                    }
                } else if (type.equals("Business")){
                    totalPrice = countPeople * 10.90;
                    if (countPeople >= 100) {
                        totalPrice = totalPrice - (10 * 10.90);
                    }
                } else if (type.equals("Regular")){
                    totalPrice = countPeople * 15;
                    if (countPeople >= 10 && countPeople <= 20){
                        totalPrice = totalPrice - (totalPrice * 0.05);
                    }
                }
                break;
            case "Saturday":
                if (type.equals("Students")){
                    totalPrice = countPeople * 9.80;
                    if (countPeople >= 30) {
                        totalPrice = totalPrice - (totalPrice * 0.15);
                    }
                } else if (type.equals("Business")){
                    totalPrice = countPeople * 15.60;
                    if (countPeople >= 100) {
                        totalPrice = totalPrice - (10 * 15.60);
                    }
                } else if (type.equals("Regular")){
                    totalPrice = countPeople * 20;
                    if (countPeople >= 10 && countPeople <= 20){
                        totalPrice = totalPrice - (totalPrice * 0.05);
                    }
                }
                break;
            case "Sunday":
                if (type.equals("Students")){
                    totalPrice = countPeople * 10.46;
                    if (countPeople >= 30) {
                        totalPrice = totalPrice - (totalPrice * 0.15);
                    }
                } else if (type.equals("Business")){
                    totalPrice = countPeople * 16;
                    if (countPeople >= 100) {
                        totalPrice = totalPrice - (10 * 16);
                    }
                } else if (type.equals("Regular")){
                    totalPrice = countPeople * 22.50;
                    if (countPeople >= 10 && countPeople <= 20){
                        totalPrice = totalPrice - (totalPrice * 0.05);
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}


