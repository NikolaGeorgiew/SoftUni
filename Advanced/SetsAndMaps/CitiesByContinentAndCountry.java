package SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        Map<String, Map<String, List<String>>> continentsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String continent = info[0];
            String country = info[1];
            String city = info[2];

            continentsMap.putIfAbsent(continent,new LinkedHashMap<>());
            Map<String, List<String>> countries = continentsMap.get(continent);
            countries.putIfAbsent(country,new ArrayList<>());
            List<String> cities = countries.get(country);
            cities.add(city);
        }

        continentsMap.entrySet().stream().
                forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    entry.getValue().entrySet().stream().forEach(innerEntry -> {
                        String list = String.join(", ", innerEntry.getValue());
                        System.out.printf("%s -> %s%n",innerEntry.getKey(),list);
                    });
                });
    }
}
