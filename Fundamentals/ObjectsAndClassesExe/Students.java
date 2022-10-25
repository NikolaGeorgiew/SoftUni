package ObjectsAndClassesExe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstName;
        String lastName;
        double grade;
        public Student (String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }
        @Override
        public String toString() {
            return String.format("%s %s: %.2f%n", this.firstName, this.lastName,this.grade);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String studentInfo = scanner.nextLine();
            String firstName = studentInfo.split(" ")[0];
            String lastName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);
            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);

        }
        studentList.sort(Comparator.comparingDouble(Student :: getGrade).reversed());
        for (Student student : studentList) {
            System.out.print(student.toString());
        }
    }
}
