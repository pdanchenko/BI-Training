package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Ruslan_Zdor on 10/26/2016.
 */
public class TransactionExample {
    public static void main(String[] str) throws SQLException {
        ConnectionManager manager = new ConnectionManager();
        Connection connection = null;
        Statement statement = null;
        try {
            connection  =  manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");
            connection.setAutoCommit(false);
            String [] queries = {
                    "insert into sakila.actor (first_name, last_name, last_update) values ('Ruslan', 'Zdor',  sysdate())",
                    "insert into sakila.actor (first_name, last_name, last_update) values ('Ruslan1', 'Zdor',  sysdate())",
                    "insert into sakila.actor (first_name, last_name, last_update) values ('Ruslan2', 'Zdor',  sysdate())",
                    };

            statement = connection.createStatement();

            int count = 0;
            for (String query : queries) {
                statement.execute(query);
                if (count == 1) {
                    throw new RuntimeException();
                }
                count = 1;
            }
            connection.commit();
        } catch(Exception e) {
            connection.rollback();
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
        System.out.println("Success");
    }
}
