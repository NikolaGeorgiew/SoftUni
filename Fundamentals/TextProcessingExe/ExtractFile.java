package TextProcessingExe;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] text = input.split("\\\\");

        String file = text[text.length -1];
        String fileName = file.split("\\.")[0];
        String extension = file.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
