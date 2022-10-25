package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(firstBox::offer);

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(secondBox::push);

        int myLoot = 0;
        while (secondBox.size() != 0 && firstBox.size() != 0) {
            int sum = firstBox.peek() + secondBox.peek();
            if (sum % 2 == 0) {
                myLoot += sum;
                firstBox.poll();
                secondBox.pop();
            } else {
                int lastItem = secondBox.peek();
                secondBox.pop();
                firstBox.offer(lastItem);

            }

        }

        if (firstBox.isEmpty()){
            System.out.println("First lootbox is empty");
        } else if (secondBox.isEmpty()) {
            System.out.println("Second lootbox is empty");
        }
        if (myLoot >= 100) {
            System.out.printf("Your loot was epic! Value: %d%n",myLoot);
        } else {
            System.out.printf("Your loot was poor... Value: %d",myLoot);
        }
    }
}
