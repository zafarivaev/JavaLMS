package app.Model;

import app.Util.Gender;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "students")
public class Student {

    @DatabaseField
    public
    String firstName;

    @DatabaseField
    public
    String lastName;

    @DatabaseField
    public
    Gender gender;

    @DatabaseField(id = true)
    public
    String email;

    @DatabaseField
    public
    String password;

    public Student(){

    }

    public Student(String firstName,
                     String lastName,
                     Gender gender,
                     String email,
                     String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

}
