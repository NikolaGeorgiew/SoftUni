package RegexExe;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        List<String> namesList = Arrays.stream(names.split(", ")).collect(Collectors.toList());

        Map<String,Integer> namesMap = new LinkedHashMap<>();
        namesList.forEach(name -> namesMap.put(name, 0));

        String input = scanner.nextLine();


        while (!input.equals("end of race")){
            //G!32e%o7r#32g$235@!2e
            Pattern patternName = Pattern.compile("[A-Za-z]+");
            Matcher matcherName = patternName.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();
            while (matcherName.find()){
                nameBuilder.append(matcherName.group());

            }
            String currentName = nameBuilder.toString();
            Pattern patternDigits = Pattern.compile("[0-9]");
            Matcher matcherDigits = patternDigits.matcher(input);

            int distance = 0;
            while (matcherDigits.find()){
                distance += Integer.parseInt(matcherDigits.group());
            }
            if (namesMap.containsKey(currentName)){
                int currentDistance = namesMap.get(currentName);
                namesMap.put(currentName,currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        List<String> nameOfFirstThree = namesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));
    }
}
