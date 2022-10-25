package DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        List<Car> carsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split(" ");
            if (data.length == 1) {
                String brand = data[0];
                Car car = new Car(brand);
                car.setBrand(brand);
                carsList.add(car);

            } else {
                String brand = data[0];
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);
                Car car = new Car(brand,model,horsePower);
                car.setBrand(brand);
                car.setModel(model);
                car.setHorsePower(horsePower);
                carsList.add(car);
            }

        }
        for (Car car : carsList) {
            System.out.println(car.toString());
        }

        //System.out.println(String.format("The car is: %s %s - %d HP",car.getBrand(), car.getModel(),car.getHorsePower()));
        //System.out.println(car.toString());
    }
}
