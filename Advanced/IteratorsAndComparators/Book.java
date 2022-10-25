package IteratorsAndComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    List<String> authors;

    public Book(String title,int year,String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<String>();

        } else {
            this.authors = Arrays.asList(authors);
        }
    }
    public int compareTo(Book other) {
        int result = this.getTitle().compareTo(other.getTitle());

        if (result == 0) {
            result = Integer.compare(this.getYear(),other.getYear());
        }
        return  result;
    }
}
