package StreamsExe;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String path = "resources2/words.txt";

        BufferedReader bf = new BufferedReader(new FileReader(path));
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        PrintWriter pw = new PrintWriter("word-count.txt");

        String line = bf.readLine();
        while (line != null) {
            String[] arr = line.split(" ");
            for (String word : arr) {
                map.put(word, 0);
            }

            line = bf.readLine();
        }
        Scanner wordScanner = new Scanner(new FileInputStream("resources2/text.txt"));
        while (wordScanner.hasNext()) {
            String currentWord = wordScanner.next();
            if (map.containsKey(currentWord)) {
                int occurences = map.get(currentWord);
                map.put(currentWord,occurences + 1);
            }

        }
        for (var entry : map.entrySet()) {
            pw.printf("%s - %d%n", entry.getKey(),entry.getValue());
        }
        bf.close();
        pw.close();
    }
}
