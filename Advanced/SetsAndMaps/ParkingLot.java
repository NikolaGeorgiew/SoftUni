package SetsAndMaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        HashSet<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")){
            String[] inputArr = input.split(", ");
            String command = inputArr[0];
            String plate = inputArr[1];
            if (command.equals("IN")){
                parking.add(plate);
            } else if (command.equals("OUT")){
                parking.remove(plate);
            }
            input = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parking) {
                System.out.println(car);
            }
        }
    }
}
