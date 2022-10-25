package ObjectsAndClassesExe;

import java.util.Scanner;

public class OpinionPoll {
    static class Person {
        String name;
        int age;
        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return this.name + " - " + this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            Person person = new Person(name, age);
            if (age > 30) {
                System.out.println(person.toString());
            }

        }
    }
}
