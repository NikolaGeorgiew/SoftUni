package FinalExamPrep2;

import java.util.*;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCars = Integer.parseInt (scanner.nextLine());


        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 1; i <= numberCars; i++) {
            String carInfo = scanner.nextLine();
            String car = carInfo.split("\\|")[0];
            int mileage = Integer.parseInt(carInfo.split("\\|")[1]);
            int fuel = Integer.parseInt(carInfo.split("\\|")[2]);
            List<Integer> valueList = new ArrayList<>();
            valueList.add(mileage);
            valueList.add(fuel);
            carsMap.put(car,valueList);
        }
        String commands = scanner.nextLine();
        while (!commands.equals("Stop")){

            if (commands.contains("Drive")){
                String car = commands.split(" : ")[1];
                int distance = Integer.parseInt(commands.split(" : ")[2]);
                int neededFuel = Integer.parseInt(commands.split(" : ")[3]);
                int mileage = carsMap.get(car).get(0);
                int fuel = carsMap.get(car).get(1);
                if (fuel >= neededFuel){
                    mileage = mileage + distance;
                    carsMap.get(car).set(0,mileage);
                    fuel = fuel - neededFuel;
                    carsMap.get(car).set(1,fuel);
                    System.out.printf("%s driven for %s kilometers. %d liters of fuel consumed.%n",car,distance,neededFuel);

                    if (mileage >= 100000) {
                        carsMap.remove(car);
                        System.out.printf("Time to sell the %s!%n",car);
                    }
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

            } else if (commands.contains("Refuel")){
                String car = commands.split(" : ")[1];
                int newFuel = Integer.parseInt(commands.split(" : ")[2]);
                int fuel = carsMap.get(car).get(1);
                int diff = 0;
                boolean isOVer = false;
                if (fuel + newFuel > 75){
                    carsMap.get(car).set(1,75);
                    diff = 75 - fuel;
                    isOVer = true;
                } else {
                    carsMap.get(car).set(1, fuel + newFuel);
                }
                if (!isOVer) {
                    diff = newFuel;
                }


                System.out.printf("%s refueled with %d liters%n",car,diff);

            } else if (commands.contains("Revert")){
                String car = commands.split(" : ")[1];
                int givenKilometers = Integer.parseInt(commands.split(" : ")[2]);
                int kilometers = carsMap.get(car).get(0);
                carsMap.get(car).set(0,kilometers - givenKilometers);

                if (carsMap.get(car).get(0) < 10000){
                    carsMap.get(car).set(0, 10000);
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n",car, givenKilometers);
                }


            }

            commands = scanner.nextLine();
        }
        carsMap.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));
    }
}
