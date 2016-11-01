package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ruslan_Zdor on 10/26/2016.
 */
public class CloseResourcesExample {
    public static void main(String[] str) throws Exception {
        ConnectionManager manager = new ConnectionManager();
        try (
                Connection connection = manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");
        ) {
//            connection = manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

            CallableStatement statement = connection.prepareCall("select * from film limit 10");

            ResultSet result = statement.executeQuery();

            while(result.next()) {
                System.out.println(" : " + result.getString("title"));
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
/*
        try {
            connection = manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

            CallableStatement statement = connection.prepareCall("select * from film limit 10");

            ResultSet result = statement.executeQuery();

            while(result.next()) {
                System.out.println(i + " : " + result.getString("title"));
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }finally {
            connection.close();
        }

*/

/*
        try (
            Connection connection = manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");
         ) {
            connection = manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

            CallableStatement statement = connection.prepareCall("select * from film limit 10");

            ResultSet result = statement.executeQuery();

            while(result.next()) {
                System.out.println(i + " : " + result.getString("title"));
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }

*/
    }
}
