package StreamsExe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.WeakHashMap;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String path = "resources2/input.txt";

        BufferedReader bf = new BufferedReader(new FileReader(path));

        String line = bf.readLine();
        while (line != null) {
            long sum = 0;
            for (char c : line.toCharArray()) {
                sum += c;
            }
            System.out.println(sum);
            line = bf.readLine();
        }

    }
}
