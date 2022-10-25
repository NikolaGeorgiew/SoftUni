package RegexExe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> messageList = new ArrayList<>();
        int countMessages = Integer.parseInt (scanner.nextLine());
        for (int i = 1; i <= countMessages; i++) {
            String encryptedMessage = scanner.nextLine();
            String decryptedMessage = decryptedMessage(encryptedMessage);
            messageList.add(decryptedMessage);
        }
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (String message : messageList) {
            Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiers>[0-9]+)");
            Matcher matcher = pattern.matcher(message);
            while (matcher.find()){
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldiers = Integer.parseInt(matcher.group("soldiers"));
                if (attackType.equals("A")){
                    attackedPlanets.add(planetName);
                } else if (attackType.equals("D")){
                    destroyedPlanets.add(planetName);
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.println("Attacked planets: " + attackedPlanets.size());
        attackedPlanets.forEach(name -> System.out.println("-> " + name));
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        destroyedPlanets.forEach(name -> System.out.println("-> " + name));

    }
    public static String decryptedMessage(String encryptedMessage){
        StringBuilder decryptedMessage = new StringBuilder();
        for (char symbol: encryptedMessage.toCharArray()) {
            char newSymbol = (char) (symbol - countLetters(encryptedMessage));
            decryptedMessage.append(newSymbol);
        }
        String message = decryptedMessage.toString();
        return message;
    }
    public static int countLetters (String encryptedMessage) {
        int count = 0;
        for (char symbol: encryptedMessage.toCharArray()){
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count ++;
                    break;
            }
        }
        return count;
    }
}
