package FinalExamPrep2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([=|\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> destinationList = new ArrayList<>();
        int sum = 0;
        while (matcher.find()) {
            String destination = matcher.group("destination");
            sum += destination.length();
            destinationList.add(destination);

        }
        System.out.println("Destinations: " + String.join(", ", destinationList));
        System.out.printf("Travel Points: %d",sum);
    }
}
