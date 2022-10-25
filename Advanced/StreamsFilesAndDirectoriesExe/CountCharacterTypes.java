package StreamsExe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "resources2/input.txt";

        BufferedReader bf = new BufferedReader(new FileReader(path));
        PrintWriter pw = new PrintWriter("count-characters.txt");

        String line = bf . readLine();
        int vowels = 0;
        int punctuation = 0;
        int otherSymbols = 0;
        while (line != null ) {
            for (char symbol : line.toCharArray()) {
                if (isVowel(symbol)){
                    vowels++;
                } else if (isPunctuation(symbol)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbol)){
                    otherSymbols++;
                }
            }
            line = bf.readLine();
        }
        pw.write("Vowels: " + vowels);
        pw.println();
        pw.write("Other symbols: " + otherSymbols);
        pw.println();
        pw.write("Punctuation: " + punctuation);
        bf.close();
        pw.close();
    }

    private static boolean isPunctuation(char symbol) {
        return  symbol == '!' || symbol == '?' || symbol == ',' || symbol == '.';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }
}
