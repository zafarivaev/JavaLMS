package app.Util;

import app.Model.Account;
import app.Model.Admin;
import app.Model.Book;
import app.Model.Student;
import app.Model.Librarian;
import app.Model.Base.User;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;
import java.rmi.StubNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseProvider {

    private static Dao dao = null;
    public static String databaseURL = "jdbc:h2:./data/db";

    public static ConnectionSource connectionSource() {

        ConnectionSource connectionSource =
                null;
        try {
            connectionSource = new JdbcConnectionSource(databaseURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connectionSource;
    }

    public static Dao provideDao(Class dataClass) {

        try {

            dao =
                    DaoManager.createDao(connectionSource(), dataClass);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dao;
    }

    public static void createTableIfNotExists(ConnectionSource connectionSource, Class dataClass) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, dataClass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // C
    public static void create(Object object) {
        try {
            dao.create(object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // R
    public static Object queryForAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void closeDatabase() {
        try {
            connectionSource().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addAdmin(String info[]){

        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Admin.class);

        // if you need to create the 'accounts' table make this call
        DatabaseProvider.createTableIfNotExists(connectionSource, Admin.class);

        // create an instance of Account
        Admin admin = new Admin();
        admin.setFirstName(info[0]);
        admin.setLastName(info[1]);
        if(info[2] == "Female"){
            admin.setGender(Gender.female);
        }else {
            admin.setGender(Gender.male);
        }
        admin.setEmail(info[3]);
        admin.setPassword(info[4]);

        // persist the account object to the database
        DatabaseProvider.create(admin);

        // close database
        closeDatabase();
    }

    public static void addLibrarian(String info[]){
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Admin.class);

        // if you need to create the 'accounts' table make this call
        DatabaseProvider.createTableIfNotExists(connectionSource, Librarian.class);

        // create an instance of Account
        Librarian librarian = new Librarian();
        librarian.setFirstName(info[0]);
        librarian.setLastName(info[1]);
        if(info[2] == "Female"){
            librarian.setGender(Gender.female);
        }else {
            librarian.setGender(Gender.male);
        }
        librarian.setEmail(info[3]);
        librarian.setPassword(info[4]);

        // persist the account object to the database
        DatabaseProvider.create(librarian);

        // close database
        closeDatabase();

    }

    public static void addStudent(String info[]){
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Student.class);

        // if you need to create the 'accounts' table make this call
        DatabaseProvider.createTableIfNotExists(connectionSource, Student.class);

        // create an instance of Account
        Student student = new Student();
        student.setFirstName(info[0]);
        student.setLastName(info[1]);
        if(info[2] == "Female"){
            student.setGender(Gender.female);
        }else {
            student.setGender(Gender.male);
        }
        student.setEmail(info[3]);
        student.setPassword(info[4]);

        // persist the account object to the database
        DatabaseProvider.create(student);

        // close database
        closeDatabase();
    }

    public static void updateAdmin(Admin admin,Admin adminChanging) {
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Admin.class);

        ArrayList<Admin> adminArrayList = new ArrayList<>();
        adminArrayList = (ArrayList<Admin>) DatabaseProvider.queryForAll();
        int counter = 0;
        for (Admin obj : adminArrayList) {
            if(obj == admin){
                adminArrayList.set(counter,adminChanging);
                break;
            }
            counter++;
        }
        closeDatabase();
    }

    public static void updateLibrarian(Librarian librarian,Librarian librarianChanging){
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Librarian.class);

        ArrayList<Librarian> librarianArrayList = new ArrayList<>();
        librarianArrayList = (ArrayList<Librarian>) DatabaseProvider.queryForAll();
        int counter = 0;
        for (Librarian obj : librarianArrayList) {
            if(obj == librarian){
                librarianArrayList.set(counter,librarianChanging);
                break;
            }
            counter++;
        }
        closeDatabase();
    }

    public static void updateStudent(Student student, Student studentChanging){
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Student.class);

        ArrayList<Student > studentArrayList = new ArrayList<>();
        studentArrayList = (ArrayList<Student>) DatabaseProvider.queryForAll();
        int counter = 0;
        for (Student obj : studentArrayList) {
            if(obj == student){
                studentArrayList.set(counter,studentChanging);
                break;
            }
            counter++;
        }
        closeDatabase();
    }

    public static void deleteAdmin(Admin admin){
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Admin.class);

        ArrayList<Admin> adminArrayList = new ArrayList<>();
        adminArrayList = (ArrayList<Admin>) DatabaseProvider.queryForAll();
        for (Admin obj : adminArrayList) {
            if(obj == admin){
                adminArrayList.remove(admin);
                break;
            }
        }
        closeDatabase();
    }

    public static void deleteLibrarian(Librarian librarian){
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Librarian.class);

        ArrayList<Librarian> librarianArrayList = new ArrayList<>();
        librarianArrayList = (ArrayList<Librarian>) DatabaseProvider.queryForAll();
        for (Librarian obj : librarianArrayList) {
            if(obj == librarian){
                librarianArrayList.remove(librarian);
                break;
            }
        }
        closeDatabase();
    }

    public static void deleteStudent(Student student){
        String databaseUrl = DatabaseProvider.databaseURL;
        // create a connection source to our database
        ConnectionSource connectionSource = DatabaseProvider.connectionSource();

        // instantiate the dao
        Dao<Account, String> accountDao =
                DatabaseProvider.provideDao(Student.class);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList = (ArrayList<Student>) DatabaseProvider.queryForAll();
        for (Student obj : studentArrayList) {
            if(obj == student){
                studentArrayList.remove(student);
                break;
            }
        }
        closeDatabase();
    }
}


