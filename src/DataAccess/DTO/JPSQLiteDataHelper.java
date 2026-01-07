package DataAccess.DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class JPSQLiteDataHelper {
    private static final String JPDBConnection = "jdbc:sqlite:DataBase//EXOBOT.sqlite";
    private static Connection jpConn = null;

    protected static synchronized Connection jpOpenConnection() throws Exception {
        try {
            if (jpConn == null)
                jpConn = DriverManager.getConnection(JPDBConnection);
        } catch (SQLException e) {
            throw e;
        }
        return jpConn;
    }

    protected static void closeConnection() throws Exception {
        try {
            if (jpConn != null)
                jpConn.close();
        } catch (Exception e) {
            throw e;
        }
    }

}
