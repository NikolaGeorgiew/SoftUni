package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        Map<String, List<Double>> map = new TreeMap<>();


        for (int i = 1; i <= n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String name = info[0];
            double grade = Double.parseDouble(info[1]);
            if (!map.containsKey(name)) {
                map.put(name,new ArrayList<>());
                map.get(name).add(grade);
            } else {
                map.get(name).add(grade);
            }
        }

        for (var entry : map.entrySet()) {
            double avgGradeSum = 0;
            for (Double grade : entry.getValue()) {
                avgGradeSum += grade;
            }

            System.out.printf("%s -> %s (avg: %.2f)%n", entry.getKey(), entry.getValue().stream()
                   .map(d -> String.format("%.2f", d)).
                   collect(Collectors.joining(" ")),
                   avgGradeSum / entry.getValue().size()
           );
        }
    }
}
