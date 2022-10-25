package ExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\|");

        int health = 100;
        int bitcoins = 0;

        boolean isDead = false;
        for (int i = 0; i < array.length; i++) {
            String currentElement = array[i];
            String[] room = currentElement.split(" ");
            String command =room[0];
            int number = Integer.parseInt(room[1]);

            if (command.contains("potion")){
                int healthDiff = 100 - health;
                health = health + number;
                if (health > 100) {
                    health = 100;
                    number = healthDiff;
                }
                System.out.printf("You healed for %d hp.%n", number);
                System.out.printf("Current health: %d hp.%n",health);

            } else if (command.contains("chest")){
                System.out.printf("You found %d bitcoins.%n", number);
                bitcoins += number;
            } else {
                health = health - number;

                if (health > 0) {
                    System.out.printf("You slayed %s.%n",command);
                } else {
                    System.out.printf("You died! Killed by %s.%n",command);
                    System.out.printf("Best room: %d", i + 1);
                    isDead = true;
                }
            }
            if (isDead) {
                break;
            }
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitcoins);
            System.out.printf("Health: %d%n", health);
        }
        }
    }
