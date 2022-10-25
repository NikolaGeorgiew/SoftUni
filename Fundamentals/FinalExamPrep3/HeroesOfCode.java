package FinalExamPrep3;

import java.util.*;

public class HeroesOfCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String heroName = input.split(" ")[0];
            int HP = Integer.parseInt(input.split(" ")[1]);
            int MP = Integer.parseInt(input.split(" ")[2]);
            List<Integer> infoList = new ArrayList<>();
            infoList.add(HP);
            infoList.add(MP);
            heroesMap.put(heroName, infoList);

        }
        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            if (commands.contains("CastSpell")) {
                String heroName = commands.split(" - ")[1];
                int MPNeeded = Integer.parseInt(commands.split(" - ")[2]);
                String spell = commands.split(" - ")[3];
                int currentMana = heroesMap.get(heroName).get(1);
                if (currentMana >= MPNeeded) {
                    int newMana = currentMana - MPNeeded;
                    heroesMap.get(heroName).set(1, newMana);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spell, newMana);

                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spell);
                }

            } else if (commands.contains("TakeDamage")) {
                String heroName = commands.split(" - ")[1];
                int damage = Integer.parseInt(commands.split(" - ")[2]);
                String attacker = commands.split(" - ")[3];
                int currentHp = heroesMap.get(heroName).get(0);
                int newHp = currentHp - damage;
                if (newHp > 0) {
                    heroesMap.get(heroName).set(0, newHp);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, newHp);
                } else {
                    heroesMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }

            } else if (commands.contains("Recharge")) {
                String heroName = commands.split(" - ")[1];
                int amount = Integer.parseInt(commands.split(" - ")[2]);
                int currentMana = heroesMap.get(heroName).get(1);
                int newMana = currentMana + amount;
                if (newMana >= 200) {
                    heroesMap.get(heroName).set(1, 200);
                    int diff = 200 - currentMana;
                    System.out.printf("%s recharged for %d MP!%n", heroName, diff);
                } else {
                    heroesMap.get(heroName).set(1, newMana);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                }

            } else if (commands.contains("Heal")) {
                String heroName = commands.split(" - ")[1];
                int amount = Integer.parseInt(commands.split(" - ")[2]);
                int currentHp = heroesMap.get(heroName).get(0);
                int newHp = currentHp + amount;
                if (newHp >= 100) {
                    int diff = 100 - currentHp;
                    heroesMap.get(heroName).set(0, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, diff);
                } else {
                    heroesMap.get(heroName).set(0, newHp);
                    System.out.printf("%s healed for %d HP!%n", heroName, amount);
                }

            }
            commands = scanner.nextLine();
        }
        heroesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.printf(" HP: %d%n",entry.getValue().get(0));
            System.out.printf(" MP: %d%n", entry.getValue().get(1));
        });
        }
    }
