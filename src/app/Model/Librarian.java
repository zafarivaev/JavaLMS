package app.Model;

import app.Model.Base.User;
import app.Util.Gender;
import app.Util.UserRole;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "librarian")
public class Librarian extends User {

    public Librarian(){

    }

    public Librarian(String firstName,
                 String lastName,
                 Gender gender,
                 String email,
                 String password) {
        super(firstName, lastName, gender, email, password, UserRole.Librarian);
    }
}






