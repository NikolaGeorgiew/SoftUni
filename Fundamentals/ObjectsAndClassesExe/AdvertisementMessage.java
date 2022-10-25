package ObjectsAndClassesExe;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public class Message {
        String phrase;
        String event;
        String author;
        String city;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
        "Exceptional product.", "I can’t live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
        "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elene", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int n = Integer.parseInt (scanner.nextLine());

        Random rnd = new Random();
        for (int i = 1; i <= n; i++) {
            int randomPhraseNum = rnd.nextInt(phrases.length);
            int randomEventNum = rnd.nextInt(event.length);
            int randomAuthor = rnd.nextInt(authors.length);
            int randomCity = rnd.nextInt(cities.length);

            System.out.println(String.join(" ", phrases[randomPhraseNum] + " " + event[randomEventNum] + " " + authors[randomAuthor] + " " + cities[randomCity]));

        }
    }
}
