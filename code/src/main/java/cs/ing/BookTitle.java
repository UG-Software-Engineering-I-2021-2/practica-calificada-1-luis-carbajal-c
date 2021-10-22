package cs.ing;

import java.util.ArrayList;
import java.util.List;

public class BookTitle {
    private final String title;
    private final Integer year;
    private final Author author;
    private boolean newTitle;   // true if book is new
    private List<BookCopy> copies;

    public BookTitle(String title, Integer year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.newTitle = true;

        this.copies = new ArrayList<>();
        BookCopy original = new BookCopy(this, 0L); // Original copy
        copies.add(original);
    }

    public void notNew() {
        newTitle = false;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isNewTitle() {
        return newTitle;
    }
}
