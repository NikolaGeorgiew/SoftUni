package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbs = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> counts = new TreeMap<>();

        for (double numb : numbs) {
            Integer currentValue = counts.get(numb);
            if (counts.containsKey(numb)) {
                counts.put(numb, currentValue + 1);
            } else {
                counts.put(numb,1);
            }
        }
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(), entry.getValue());
        }

    }
}
