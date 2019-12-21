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
public class Admin {

    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private String password;

    public Admin() {
        // ORMLite needs a no-arg constructor
    }
    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
