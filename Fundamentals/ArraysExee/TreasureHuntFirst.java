package ArraysExee;

import java.util.Scanner;

public class TreasureHuntFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String commands = scanner.nextLine();

        while (!commands.equals("Yohoho!")){
            String[] commandParts = commands.split(" ");

            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 1; i <commandParts.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandParts[i].equals(treasureChest[j])){
                                alreadyContained = true;
                                break;
                            }
                        }
                    }
                    break;
                case "Drop":

                    break;
                case "Steal":

                    break;
            }



            commands = scanner.nextLine();
        }
    }
}
