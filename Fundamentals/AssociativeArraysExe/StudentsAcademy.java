package AssociativeArraysExe;

import java.util.*;

public class StudentsAcademy {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());
        Map<String, List<Double>> map = new LinkedHashMap<>();

        for (int rows = 1; rows <=n ; rows++) {
            String student = scanner.nextLine();
            Double grade = Double.parseDouble (scanner.nextLine());
            if (!map.containsKey(student)) {
                map.put(student, new ArrayList<>());
                map.get(student).add(grade);
            } else {
                map.get(student).add(grade);
            }
        }
        Map<String,Double> newMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double averageGradeForStudent = 0;
            for (double currentGrade : entry.getValue()) {
                if (entry.getValue().size() > 1){
                    averageGradeForStudent += currentGrade;
                    if (entry.getValue().indexOf(currentGrade) == entry.getValue().size() -1) {
                        averageGradeForStudent =  averageGradeForStudent / entry.getValue().size();
                    }
                    if (averageGradeForStudent >= 4.50) {
                        newMap.put(entry.getKey(), averageGradeForStudent);
                    }
                } else {
                    averageGradeForStudent = entry.getValue().get(0);
                    if (averageGradeForStudent >= 4.50) {
                        newMap.put(entry.getKey(), averageGradeForStudent);
                    }
                }
            }
        }
        newMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue()));
    }
}
