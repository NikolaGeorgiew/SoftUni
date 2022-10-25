package ObjectsAndClassesExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesSecond {
    static class Article {
        String title;
        String content;
        String author;
        public Article (String title, String content,String author) {
            this.title = title;
            this.content = content;
            this.author = author;

        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getContent() {
            return content;
        }

        @Override
        public String toString () {
            return String.format("%s - %s: %s%n", this.title, this.content,this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        List<Article> articleList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];
            Article article = new Article(title,content,author);
            articleList.add(article);

        }
        for (Article article : articleList) {
            System.out.print(article.toString());
        }
    }
}
