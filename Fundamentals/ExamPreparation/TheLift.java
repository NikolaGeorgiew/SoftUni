package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt (scanner.nextLine());

        int[] lift = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();



        boolean isThereEmptySpot = true;
        for (int i = 0; i < lift.length; i++) {
            while (lift[i] != 4){
                lift[i] ++;
                peopleWaiting--;
                if (peopleWaiting == 0) {
                    break;
                }
                if (lift[lift.length -1] == 4) {
                    isThereEmptySpot = false;
                    break;
                }
            }

        }
        if (isThereEmptySpot) {
            System.out.println("The lift has empty spots!");
            for (int numb : lift) {
                System.out.print(numb + " ");
            }
        }
        if (peopleWaiting > 0 && !isThereEmptySpot) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleWaiting);
            for (int numb : lift) {
                System.out.print(numb + " ");
            }
        }
        if (!isThereEmptySpot && peopleWaiting == 0) {
            for (int numb: lift) {
                System.out.print(numb + " ");
            }
        }
    }
}
