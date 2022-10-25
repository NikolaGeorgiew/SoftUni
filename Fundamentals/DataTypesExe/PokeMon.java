package DataTypesExe;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt (scanner.nextLine());
        int distance = Integer.parseInt (scanner.nextLine());
        int exhaust = Integer.parseInt (scanner.nextLine());

        int firstPower = power;
        int count = 0;
        while (power >= distance) {
            count++;
            power = power - distance;
            if (power == firstPower * 0.5) {
                if (exhaust > 0) {
                    power = power / exhaust;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
