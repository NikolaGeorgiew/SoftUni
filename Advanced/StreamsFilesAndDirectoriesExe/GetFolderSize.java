package StreamsExe;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;

public class GetFolderSize {
    public static void main(String[] args) {

        File root = new File("resources2");
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(root);

        int sumOfBytes = 0;

        while (!directories.isEmpty()) {
            File currentFile = directories.poll();
            File[] files = currentFile.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    directories.offer(file);
                } else {
                    sumOfBytes += file.length();
                }
            }
        }
        System.out.println(sumOfBytes);
    }
}
