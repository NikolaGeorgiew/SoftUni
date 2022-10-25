package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        Set<Character> punctuation = Set.of(',' , '.', '!', '?');

        int bytes  = inputStream.read();

        while (bytes >= 0) {
             char symbol = (char)bytes;
            boolean isContains = punctuation.contains(symbol);
            if (!isContains) {
                outputStream.write(symbol);
            }
            bytes = inputStream.read();

        }

    }
}
