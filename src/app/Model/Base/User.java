package app.Model.Base;

import app.Util.Gender;
import app.Util.UserRole;

public class User {
    public String firstName;
    public String lastName;
    Gender gender;
    String email;
    String password;

    UserRole userRole;

    public User(String firstName,
                String lastName,
                Gender gender,
                String email,
                String password,
                UserRole userRole) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;

        this.userRole = userRole;
    }

}
