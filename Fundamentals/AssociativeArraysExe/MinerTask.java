package AssociativeArraysExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, Integer> map = new LinkedHashMap<>();
        int row = 0;
        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!map.containsKey(resource)) {
                map.put(resource,quantity);
            } else {
                int value = map.get(resource);
                map.put(resource,quantity + value);
            }

            command = scanner.nextLine();
        }

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
