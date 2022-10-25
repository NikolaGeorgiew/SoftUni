package AssociativeArrays;

import java.util.*;


public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String keyWord = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!words.containsKey(keyWord)) {
                words.put(keyWord,new ArrayList<>());
                words.get(keyWord).add(synonym);
            } else {
                words.get(keyWord).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> stringListEntry : words.entrySet()) {
            System.out.printf("%s - %s%n",stringListEntry.getKey(), String.join(", ", stringListEntry.getValue()));
        }

    }
}
