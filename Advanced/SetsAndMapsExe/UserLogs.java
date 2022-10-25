package SetsAndMapsExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String,Integer>> users = new TreeMap<>();

        while (!input.equals("end")){
            String[] inputArr = scanner.nextLine().split(" ");
            String ipAdress = inputArr[0].split("=")[1];
            String message = inputArr[1].split("=")[1];
            String user = inputArr[2].split("=")[1];

            if (!users.containsKey(user)) {
                users.put(user, new LinkedHashMap<>());
            }
            if (!users.get(user).containsKey(ipAdress)){
                users.get(user).put(ipAdress,1);
            } else {
                int currentCount = users.get(user).get(ipAdress) + 1;
                users.get(user).put(ipAdress, currentCount);
            }
            input = scanner.nextLine();
        }
        System.out.println();

    }
}
