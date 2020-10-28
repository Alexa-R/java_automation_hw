package goodsActions;

import jdbc.JdbcConnection;

import java.sql.*;

public class ShowTheNumberOfProductTypes{
    public void showTheNumberOfProductTypes() throws SQLException {
        Statement statement = JdbcConnection.connection.createStatement();

        ResultSet resultSetNumberOfTypes = statement.executeQuery("SELECT COUNT(DISTINCT product_type_id) FROM goods");

        while (resultSetNumberOfTypes.next()) {
            System.out.println("The number of product types = " + resultSetNumberOfTypes.getString(1));
        }
    }
}