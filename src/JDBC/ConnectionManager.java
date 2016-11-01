package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Ruslan_Zdor on 10/26/2016.
 */
public class ConnectionManager {
    public Connection getConnection(String username,
                                     String password, String serverName, String sid, String port) throws Exception {
        String url = "jdbc:mysql://" + serverName + "/" + sid;
        String driverName = "com.mysql.cj.jdbc.Driver";

        Class.forName(driverName);
        Connection connection;
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
