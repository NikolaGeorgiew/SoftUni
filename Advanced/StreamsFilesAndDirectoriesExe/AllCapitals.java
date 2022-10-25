package StreamsExe;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "resources2/input.txt";

        BufferedReader bf = new BufferedReader(new FileReader(path));
        PrintWriter pw = new PrintWriter("output.txt");

        String line = bf.readLine();

        while (line != null) {
            for (char c : line.toCharArray()) {
                char symbol = Character.toUpperCase(c);
                pw.write(symbol);
            }
            pw.println();
            line = bf.readLine();
        }
        bf.close();
        pw.close();
    }
}
