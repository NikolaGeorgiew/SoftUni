package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main (String[] args) throws IOException {
        String path = "resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        int bytes = inputStream.read();

        while (bytes >= 0) {
            String bytesInBinary = Integer.toBinaryString(bytes);
            System.out.print(bytesInBinary + " ");

            bytes = inputStream.read();

        }

    }
}
