package StreamsExe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "resources2/inputLineNumbers.txt";

        BufferedReader bf = new BufferedReader(new FileReader(path));
        PrintWriter pw = new PrintWriter("input-lines.txt");
        String line = bf.readLine();
        int counter = 1;
        while (line != null ) {
            pw.print(counter + ". " + line);
            pw.println();

            counter++;
            line = bf.readLine();
        }
        bf.close();
        pw.close();
    }
}
