package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            ArrayList<Double> grades = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).
                    collect(Collectors.toCollection(ArrayList::new));
            studentsGrade.put(name,grades);
        }

        studentsGrade.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                forEach(entry -> {
                    var avgGrade = entry.getValue().stream().reduce(Double::sum).orElse(0d) / entry.getValue().size();
                    System.out.println(entry.getKey() + " is graduated with " + avgGrade);
                });
    }
}
