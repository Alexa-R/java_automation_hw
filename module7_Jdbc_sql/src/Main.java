import jdbc.JdbcConnection;

import java.sql.SQLException;

public class Main extends JdbcConnection {
    public static void main(String[] args) throws SQLException {
        callConnection();
        new Menu().callMenu();
        closeConnection();
    }
}