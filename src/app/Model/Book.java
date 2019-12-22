package app.Model;

import java.util.Date;

public class Book {
    private String title;
    private Date date;
    String authorName;

    Book(String title, Date date, String authorName) {
        this.title = title;
        this.date = date;
        this.authorName = authorName;
    }
}
