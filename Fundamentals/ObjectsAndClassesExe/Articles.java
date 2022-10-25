package ObjectsAndClassesExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles {
    static class Article {
        String title;
        String content;
        String author;
        public Article (String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;

        }
        public void editNewContent (String newValue) {
            this.content = newValue;
        }
        public void changeAuthor (String newValue) {
            this.author = newValue;
        }
        public void renameTitle(String newValue) {
            this.title = newValue;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }
        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];


        int n = Integer.parseInt (scanner.nextLine());
        Article article = new Article(title, content, author);



        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String commandType = command.split(": ")[0];
            String newValue = command.split(": ")[1];
            switch (commandType) {
                case "Edit":
                    article.editNewContent(newValue);

                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newValue);
                    break;
                case "Rename":
                    article.renameTitle(newValue);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
