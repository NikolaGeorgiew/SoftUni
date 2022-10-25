package AssociativeArraysExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()){
            if (symbol == ' ') {
                continue;
            }
            if (!map.containsKey(symbol)) {
                map.put(symbol, 1);
            } else {
                int value = map.get(symbol);
                map.put(symbol,value + 1);
            }
        }
        map.entrySet().forEach(entry -> System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue()));
    }
}
