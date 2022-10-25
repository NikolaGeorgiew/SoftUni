package ListsExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt (scanner.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= commands; i++) {
            String typeCommand = scanner.nextLine();
            String name = typeCommand.split(" ")[0];
            if (typeCommand.contains("is going!")){
                if (list.contains(name)) {
                    System.out.printf("%s is already in the list!%n",name);
                } else {
                    list.add(name);
                }

            } else if (typeCommand.contains("is not going!")){
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }
        }
        for (String guest : list) {
            System.out.println(guest);
        }
    }
}
