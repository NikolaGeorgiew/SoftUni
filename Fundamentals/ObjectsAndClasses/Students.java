package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName,String lastName,String age,String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return town;
        }

        public String getAge() {
            return age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")){
            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            String age = inputArr[2];
            String town = inputArr[3];

            Student student = new Student(firstName,lastName,age,town);
            studentList.add(student);


            input = scanner.nextLine();
        }
        String searchCity = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getTown().equals(searchCity)) {
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
