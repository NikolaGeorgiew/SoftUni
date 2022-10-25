package StreamsFilesDirectories;

import java.io.File;
import java.nio.file.Path;

public class ListFiles {
    public static void main(String[] args) {
        String adress = "resources/Files-and-Streams";

        File file = new File(adress);

            File[] current = file.listFiles();
            for (File f : current) {
                if (!f.isDirectory()) {
                    System.out.printf("%s: [%s]%n",f.getName(), f.length());
                }

            }
        }

}
