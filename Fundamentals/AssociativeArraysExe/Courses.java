package AssociativeArraysExe;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();
        List<String> courses = new ArrayList<>();

        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            if (!map.containsKey(courseName)) {
                courses.add(courseName);
                map.put(courseName,new ArrayList<>());
                map.get(courseName).add(studentName);
            } else {
                map.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });
    }
}
