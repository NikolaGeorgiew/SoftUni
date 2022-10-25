package SetsAndMapsExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String,String> map = new LinkedHashMap<>();

        while (!input.equals("stop")){
            String name = input;
            String email = scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")){
                map.put(name,email);
            }

            input = scanner.nextLine();
        }
        for (var entry : map.entrySet()){
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }
    }
}
