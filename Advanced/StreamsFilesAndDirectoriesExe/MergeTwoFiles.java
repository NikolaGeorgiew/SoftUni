package StreamsExe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {


        Path firstFile = Paths.get("resources2/inputOne.txt");
        List<String> firstLines = Files.readAllLines(firstFile);

        Path secondFile = Paths.get("resources2/inputTwo.txt");
        List<String> secondLines = Files.readAllLines(secondFile);

        Path output = Paths.get("output.txt");
        Files.write(output,firstLines, StandardOpenOption.APPEND);
        Files.write(output,secondLines,StandardOpenOption.APPEND);



    }
}
