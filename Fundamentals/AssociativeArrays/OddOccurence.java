package AssociativeArrays;

import java.util.*;

public class OddOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String,Integer> wordsCount = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            Integer count = wordsCount.get(wordInLowerCase);
            if (wordsCount.containsKey(wordInLowerCase)) {
                wordsCount.put(wordInLowerCase, count + 1);

            } else {
                wordsCount.put(wordInLowerCase,1);
            }
        }
        List<String> oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", oddWords));
    }
}
