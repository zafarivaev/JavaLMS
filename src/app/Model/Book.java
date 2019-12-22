package app.Model;

import java.util.Date;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "book")
public class Book {
    @DatabaseField(id = true)
    private String title;
    @DatabaseField
    private Date date;
    @DatabaseField
    private String authorName;

    public Book(String title, Date date, String authorName) {
        this.title = title;
        this.date = date;
        this.authorName = authorName;
    }
    public Book()
    {
        // ORMLite needs a no-arg constructor
    }

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}
    public Date getDate(){return date;}
    public void setDate(Date date){this.date=date;}
    public String getAuthorName(){return authorName;}
    public void setAuthorName(String authorName){this.authorName=authorName;}
}




