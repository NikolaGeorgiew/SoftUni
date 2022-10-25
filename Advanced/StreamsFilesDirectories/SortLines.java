package StreamsFilesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String adress = "resources/input.txt";

        Path path = Paths.get(adress);

        List <String> list  = Files.lines(path).sorted().collect(Collectors.toList());

        Files.write(Paths.get("sort-lines"), list);





    }
}
