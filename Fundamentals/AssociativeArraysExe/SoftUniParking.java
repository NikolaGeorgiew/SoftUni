package AssociativeArraysExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        Map<String,String> map = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            if (command.equals("register")){
                String username = input.split(" ")[1];
                String number = input.split(" ")[2];
                if (!map.containsKey(username)) {
                    map.put(username,number);
                    System.out.printf("%s registered %s successfully%n",username,number);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n",number);
                }

            } else if (command.equals("unregister")){
                String username = input.split(" ")[1];
                if (!map.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n",username);
                } else {
                    map.remove(username);
                    System.out.printf("%s unregistered successfully%n",username);
                }
            }
        }
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
