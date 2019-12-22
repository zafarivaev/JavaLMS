package app.Model;

import app.Model.Base.User;
import app.Util.Gender;
import app.Util.UserRole;

//public class Admin extends User {
//
//    public Admin(String firstName,
//                 String lastName,
//                 Gender gender,
//                 String email,
//                 String password) {
//        super(firstName, lastName, gender, email, password, UserRole.Admin);
//    }
//}

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "admins")
public class Admin extends User {
    public Admin(){

    }
    public Admin(String firstName,
                     String lastName,
                     Gender gender,
                     String email,
                     String password) {
        super(firstName, lastName, gender, email, password, UserRole.Admin);
    }
}
