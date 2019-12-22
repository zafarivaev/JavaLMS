package app.Model.Base;

import app.Util.Gender;
import app.Util.UserRole;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "user")
public class User {
    @DatabaseField(id = true)
    public String firstName;
    @DatabaseField
    public String lastName;
    @DatabaseField
    public Gender gender;
    @DatabaseField
    public String email;
    @DatabaseField
    public String password;

    UserRole userRole;

    public User(){

    }

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


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
