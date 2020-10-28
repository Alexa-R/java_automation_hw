package goodsActions;

import jdbc.JdbcConnection;

import java.sql.*;

public class ShowTheAverageCostOfGoods{
    public void showTheAverageCostOfGoods() throws SQLException {
        Statement statement = JdbcConnection.connection.createStatement();

        ResultSet resultSetAverageCostOfGoods = statement.executeQuery("SELECT AVG(cost_of_unit) FROM goods");
        System.out.print("The average cost of goods = ");
        while (resultSetAverageCostOfGoods.next()) {
            System.out.printf("%5.2f", Double.parseDouble(resultSetAverageCostOfGoods.getString(1)));
            System.out.print(" BYN\n");
        }
    }
}
