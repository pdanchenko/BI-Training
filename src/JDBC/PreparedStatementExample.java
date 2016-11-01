package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Ruslan_Zdor on 10/26/2016.
 */
public class PreparedStatementExample {
    public static void main(String[] str) throws Exception {
        ConnectionManager manager = new ConnectionManager();

        Connection connection = manager.getConnection("root", "Ujekd4c37u5", "localhost", "sakila", "1521");

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM sakila.actor where first_name = ?");
    //        statement.setDate();

            ResultSet result = statement.executeQuery();

            while(result.next()) {
          //      result.getSt
                System.out.println(result.getString("first_name") + " " + result.getString("last_name"));
            }
    }


    public static void asd() throws Exception{
        main(null);
    }
}
