package app.Util;

import app.Model.Admin;
import app.Model.Librarian;
import app.Model.Student;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DatabaseProvider {

    // Properties
    private static String databaseURL = "jdbc:h2:./database/db";

    // Provide Connection Source for Database
    private static ConnectionSource connectionSource() {
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new JdbcConnectionSource(databaseURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connectionSource;
    }

    // Close connection
    public static void closeDatabase() {
        try {
            connectionSource().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Provide dao to work with ORMLite
//    private static Dao provideDao(Class dataClass) {
//        try {
//            dao = DaoManager.createDao( connectionSource(), dataClass);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return dao;
//    }

    // Dao providers
    public static Dao<Admin, ?> provideAdminDao() {
        try {
            return DaoManager.createDao(connectionSource(), Admin.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Dao<Librarian, ?> provideLibrarianDao() {
        try {
            return DaoManager.createDao(connectionSource(), Librarian.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Dao<Student, ?> provideStudentDao() {
        try {
            return DaoManager.createDao(connectionSource(), Student.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Create table if doesn't already exist
    private static void createTableIfNotExists(ConnectionSource connectionSource, Class dataClass) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, dataClass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    public static void add(Object object, Dao dao) {
        createTableIfNotExists(connectionSource(), object.getClass());

        try {
            dao.create(object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public static Object get(String id, Dao dao) {

        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Object> getAll(Class dataClass, Dao dao) {
        createTableIfNotExists(connectionSource(), dataClass);
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // UPDATE
    public static void update(Object object, Dao dao) {

        try {
            dao.update(object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void delete(Object object, Dao dao) {
        try {
            dao.delete(object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Log in
    public static Object retrieveUser(Class dataClass, String email, Dao dao) {
        try {
            return dao.queryForId(email);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}


