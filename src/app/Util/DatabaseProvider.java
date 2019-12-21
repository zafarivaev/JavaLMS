package app.Util;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;
import java.sql.SQLException;

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

    public static void createTableIfNotExists(ConnectionSource connectionSource, Class<app.Model.Account> dataClass) {
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
}
