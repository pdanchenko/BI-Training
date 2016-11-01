package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Ruslan_Zdor on 10/26/2016.
 */
public class ClassicStatementExample {
    public static void main(String[] str) {
        ConnectionManager manager = new ConnectionManager();

        try {
            Connection connection  =  manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

            Statement statement = connection.createStatement();

            StringBuilder sb = new StringBuilder("SELECT * FROM sakila.actor where first_name = '");
            sb.append(str[0]);
            sb.append("'");

            ResultSet result = statement.executeQuery(sb.toString());

            while(result.next()) {
                System.out.println(result.getString("first_name") + " " + result.getString("last_name"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
