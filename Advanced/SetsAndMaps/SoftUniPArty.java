package SetsAndMaps;

import java.util.*;

public class SoftUniPArty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();


        while (!input.equals("PARTY")){
            char firstChar = input.charAt(0);
            if (Character.isDigit(firstChar)) {
                vip.add(input);

            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }
        String secondInput = scanner.nextLine();

        Set<String> guestWhoDidntCame = new TreeSet<>();

        while (!secondInput.equals("END")){
            if (vip.contains(secondInput)) {
                vip.remove(secondInput);
            } else if (regular.contains(secondInput)){
                regular.remove(secondInput);
            }
            secondInput = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        for (String guest : vip) {
            System.out.println(guest);
        }
        for (String guest : regular) {
            System.out.println(guest);
        }
    }
}
