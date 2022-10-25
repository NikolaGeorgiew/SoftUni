package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!stringList.isEmpty()) {
            Random rnd = new Random();
            int randomIndex = rnd.nextInt(stringList.size());

            String word = stringList.get(randomIndex);
            System.out.println(word);
            stringList.remove(randomIndex);
        }
    }
}
