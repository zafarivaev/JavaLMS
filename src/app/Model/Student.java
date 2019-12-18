package app.Model;

import app.Model.Base.User;
import app.Util.Gender;
import app.Util.UserRole;

public class Student {

    public String firstName;
    String lastName;
    Gender gender;
    String email;
    String password;

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
