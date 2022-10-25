package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        List <String> validPairs = new ArrayList<>();

        int validPairsCount = 0;

        while (matcher.find()){
            validPairsCount++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            StringBuilder wordBuilder = new StringBuilder(secondWord);
            wordBuilder.reverse();
            String newWord = wordBuilder.toString();
            if (firstWord.equals(newWord)){
                validPairs.add(firstWord + " <=> " + secondWord);
            }
        }
        if (validPairsCount == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n",validPairsCount);
        }
        if (validPairs.size() > 0) {
            System.out.println("The mirror words are:");
            for (String element : validPairs){
                if (validPairs.indexOf(element) != validPairs.size() -1) {
                    System.out.print(element + ", ");
                } else {
                    System.out.println(element);
                }
            }
        } else {
            System.out.println("No mirror words!");
        }

    }
}
