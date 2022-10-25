package StreamsExe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path  = "resources2/input.txt";

        BufferedReader bf = new BufferedReader(new FileReader(path));

        String line = bf.readLine();
        long sum = 0;
        while (line != null ) {
            for (char c  : line.toCharArray()) {
                sum += c;
            }

            line = bf.readLine();
        }
        System.out.println(sum);
    }
}
