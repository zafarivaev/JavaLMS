package app.Model;

import app.Model.Base.User;
import app.Util.Gender;
import app.Util.UserRole;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "student")
public class Student extends User {
    public Student(){

    }
    public Student(String firstName,
                     String lastName,
                     Gender gender,
                     String email,
                     String password) {
        super(firstName, lastName, gender, email, password, UserRole.Student);
    }

}
