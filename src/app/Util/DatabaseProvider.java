package app.Util;

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
    private static Dao dao = null;
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
    private static Dao provideDao(Class dataClass) {
        try {
            dao = DaoManager.createDao( connectionSource(), dataClass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
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
    public static void add(Object object) {
        createTableIfNotExists(connectionSource(), object.getClass());
        dao = provideDao(object.getClass());
        try {
            dao.create(object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public static Object get(String id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Object> getAll(Class dataClass) {
        dao = provideDao(dataClass);
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // UPDATE
    public static void update(Object object) {
        dao = provideDao(object.getClass());
        try {
            dao.update(object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void delete(Object object) {
        try {
            dao.delete(object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Log in
    public static Object retrieveUser(Class dataClass, String email) {
        dao = provideDao(dataClass);
        try {
            return dao.queryForId(email);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}


