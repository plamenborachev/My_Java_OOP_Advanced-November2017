package p02Library;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return Collections.unmodifiableList(this.authors);
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }
}
