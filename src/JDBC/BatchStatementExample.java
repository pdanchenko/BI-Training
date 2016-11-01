package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Ruslan_Zdor on 10/26/2016.
 */
public class BatchStatementExample {
    public static void main(String[] str) throws SQLException {
        ConnectionManager manager = new ConnectionManager();
        Connection connection = null;
        Statement statement = null;
        try {
            connection  =  manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

            String [] queries = {
                    "insert into sakila.actor (first_name, last_name, last_update) values ('Ruslan', 'Zdor',  sysdate())",
                    "insert into sakila.actor (first_name, last_name, last_update) values ('Ruslan1', 'Zdor',  sysdate())",
                    "insert into sakila.actor (first_name, last_name, last_update) values ('Ruslan2', 'Zdor',  sysdate())",
                    };

            statement = connection.createStatement();

            for (String query : queries) {
                statement.execute(query);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }

    public static void main1(String[] str) throws SQLException {
        ConnectionManager manager = new ConnectionManager();
        Connection connection = null;
        Statement statement = null;
        try {
            connection  =  manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

            String [] queries = {
                    "insert into sakila.actor (first_name, second_name, last_update) values ('Ruslan', 'Zdor',  sysdate())",
                    "insert into sakila.actor (first_name, second_name, last_update) values ('Ruslan1', 'Zdor',  sysdate())",
                    "insert into sakila.actor (first_name, second_name, last_update) values ('Ruslan2', 'Zdor',  sysdate())",
                    };

            statement = connection.createStatement();

            for (String query : queries) {
                statement.addBatch(query);
            }

            statement.executeBatch();
        } catch(Exception e) {
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }
}
