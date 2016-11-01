package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Ruslan_Zdor on 10/26/2016.
 */
public class ConnectionExample {
    public static void main(String[] str) {
        ConnectionManager manager = new ConnectionManager();

        try {
            Connection connection  =  manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

            CallableStatement statement = connection.prepareCall("select * from film");

            long sysTime = System.currentTimeMillis();

            ResultSet result = statement.executeQuery();

            while(result.next()) {
                System.out.println(result.getString("title"));
                System.out.println(System.currentTimeMillis() - sysTime);
                sysTime = System.currentTimeMillis();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
