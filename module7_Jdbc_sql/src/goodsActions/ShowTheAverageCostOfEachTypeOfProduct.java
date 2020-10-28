package goodsActions;

import jdbc.JdbcConnection;


import java.sql.*;

public class ShowTheAverageCostOfEachTypeOfProduct{

    public void showTheAverageCostOfEachTypeOfProduct() throws SQLException {
        Statement statement = JdbcConnection.connection.createStatement();

        ResultSet resultSetAvrageCostEachType = statement.
                executeQuery("SELECT type_name, AVG(cost_of_unit) FROM goods g join type_of_goods t on g.product_type_id = t.id GROUP BY type_name");
        System.out.println("The average cost of each type of product: ");
        while (resultSetAvrageCostEachType.next()) {
            System.out.println(resultSetAvrageCostEachType.getString(1) + " - " + resultSetAvrageCostEachType.getString(2) + " BYN");
        }
    }
}

