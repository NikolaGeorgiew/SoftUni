package SetsAndMapsExe;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character,Integer> map = new TreeMap<>();

        for (char symbol : input.toCharArray()) {

            if (!map.containsKey(symbol)){
                map.put(symbol, 1);
            } else {
                map.put(symbol,map.get(symbol) + 1);
            }

        }
        for (var entry : map.entrySet()) {
            System.out.printf("%c: %d time/s%n",entry.getKey(),entry.getValue());
        }
    }
}
