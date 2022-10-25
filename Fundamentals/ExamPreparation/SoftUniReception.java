package ExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        int n1 = Integer.parseInt (scanner.nextLine());
        int n2 = Integer.parseInt (scanner.nextLine());
        int studentsCount = Integer.parseInt (scanner.nextLine());

        int hours = 0;

        int allWorkersForHour = n + n1 + n2;
        while (studentsCount > 0){
            hours++;
            if (hours % 4 != 0 ) {
                studentsCount = studentsCount - allWorkersForHour;
            }
        }
        System.out.printf("Time needed: %dh.%n",hours);
    }
}
