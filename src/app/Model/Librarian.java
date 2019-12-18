package app.Model;

import app.Model.Base.User;
import app.Util.Gender;
import app.Util.UserRole;

public class Librarian extends User {

    public Librarian(String firstName,
                 String lastName,
                 Gender gender,
                 String email,
                 String password) {
        super(firstName, lastName, gender, email, password, UserRole.Librarian);
    }
}
