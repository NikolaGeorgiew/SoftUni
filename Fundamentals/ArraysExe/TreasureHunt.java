package ArraysExe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chest = (scanner.nextLine().split("\\|"));

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")){
            String[] commands = input.split(" ");
            String typeCommand = commands[0];

            switch (typeCommand) {
                case "Loot":
                    for (int i = 1; i < commands.length; i++) {
                        String currentLoot = commands[i];
                        boolean isContained = false;
                        for (int j = 0; j < chest.length; j++) {
                            String currentItemInChest = chest[j];
                            if (currentLoot.equals(currentItemInChest)){
                                isContained = true;
                            }
                        }
                        if (!isContained) {
                            String newChest = currentLoot +  " " + String.join(" ", chest);
                            chest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commands[1]);
                    if (dropIndex >= 0 && dropIndex <= chest.length -1) {

                        String itemToRemove = chest[dropIndex];
                        for (int i = dropIndex; i < chest.length - 1; i++) {
                            chest[i] = chest[i + 1];
                        }
                        chest[chest.length -1] = itemToRemove;
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commands[1]);

                    break;
            }



            input = scanner.nextLine();
        }

    }
}
