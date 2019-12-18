package app.Model;

import java.util.Date;

public class Book {
    String title;
    Date date;
    String authorName;

    Book(String title, Date date, String authorName) {
        this.title = title;
        this.date = date;
        this.authorName = authorName;
    }
}
