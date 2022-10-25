package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class HearthDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] houses =(scanner.nextLine().split("@"));

        int currentPosition = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love!")){
            int jumpIndex = Integer.parseInt(input.split(" ")[1]);
            currentPosition = currentPosition + jumpIndex;
            if (!isValidIndex(houses,currentPosition)){
                currentPosition = 0;
            }
            int currentHouse = Integer.parseInt(houses[currentPosition]);
            if (currentHouse == 0) {
                System.out.printf("Place %d already had Valentine's day.%n",currentPosition);
            } else {
                currentHouse = currentHouse - 2;
                houses[currentPosition] = String.valueOf(currentHouse);
                if (currentHouse == 0){
                    System.out.printf("Place %d has Valentine's day.%n",currentPosition);
                }
            }


            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",currentPosition);
        int countFailedPlaces = 0;
        for (int i = 0; i < houses.length; i++) {
            int currentHouse = Integer.parseInt(houses[i]);
            if (currentHouse != 0){
                countFailedPlaces++;
            }
        }
        if (countFailedPlaces == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n",countFailedPlaces);
        }
    }
    public static boolean isValidIndex(String[] arr, int index) {
        return index >= 0 && index <= arr.length -1;
    }
}
