package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integerArr = Arrays
         .stream(scanner.nextLine().split(", "))
         .mapToInt(Integer::parseInt)
         .toArray();

        int entryPoint = Integer.parseInt (scanner.nextLine());
        String typeOfItem = scanner.nextLine();

            int currentNumb = integerArr[entryPoint];
            int damageLeft = 0;

            for (int j = 0; j < entryPoint; j++) {
                int currentLeftItem = integerArr[j];
                if (typeOfItem.equals("cheap")){
                    if (currentLeftItem < currentNumb){
                        damageLeft += currentLeftItem;
                    }
                } else if (typeOfItem.equals("expensive")){
                    if (currentLeftItem >= currentNumb) {
                        damageLeft += currentLeftItem;
                    }
                }
            }
            int damageRight = 0;
        for (int i = entryPoint + 1; i < integerArr.length; i++) {
            int currentRightItem = integerArr[i];
            if (typeOfItem.equals("cheap")){
                if (currentRightItem < currentNumb) {
                    damageRight += currentRightItem;
                }
            } else if (typeOfItem.equals("expensive")){
                if (currentRightItem >= currentNumb) {
                    damageRight += currentRightItem;
                }
            }
        }
        if (damageLeft > damageRight) {
            System.out.printf("Left - %d",damageLeft);
        } else if (damageRight > damageLeft) {
            System.out.printf("Right - %d",damageRight);
        } else if (damageLeft == damageRight) {
            System.out.printf("Left - %d",damageLeft);
        }
    }
}
