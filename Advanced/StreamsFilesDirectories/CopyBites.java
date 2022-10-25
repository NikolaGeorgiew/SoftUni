package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBites {
    public static void main(String[] args) throws IOException {
        String path = "resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("copy-bites.txt");

        int bytes = inputStream.read();
        while (bytes >= 0) {
            String digits = String.valueOf(bytes);
            for (int i = 0; i < digits.length(); i++) {
                outputStream.write(digits.charAt(i));
            }

            bytes =inputStream.read();
        }
    }
}
