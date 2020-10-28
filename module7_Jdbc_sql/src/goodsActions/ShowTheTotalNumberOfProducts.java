package goodsActions;

import jdbc.JdbcConnection;

import java.sql.*;

public class ShowTheTotalNumberOfProducts{
    public void showTheTotalNumberOfProducts() throws SQLException {
        Statement statement = JdbcConnection.connection.createStatement();

        ResultSet resultSetNumberOfProducts = statement.executeQuery("SELECT COUNT(id) FROM goods");

        while (resultSetNumberOfProducts.next()) {
            System.out.println("The total number of products = " + resultSetNumberOfProducts.getString(1));
        }
    }
}
