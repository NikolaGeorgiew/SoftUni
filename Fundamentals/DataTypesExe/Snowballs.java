package DataTypesExe;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());

        double maxValue = Integer.MIN_VALUE;
        int maxSnow = Integer.MIN_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int maxQuality = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int snow = Integer.parseInt (scanner.nextLine());
            int time = Integer.parseInt (scanner.nextLine());
            int quality = Integer.parseInt (scanner.nextLine());

            double formula = (double)snow / time;
            double value = Math.pow(formula, quality);
            if (value > maxValue) {
                maxValue = value;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnow, maxTime, maxValue, maxQuality);
    }
}
