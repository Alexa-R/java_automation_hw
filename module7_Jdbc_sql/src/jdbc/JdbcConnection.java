package jdbc;

import java.sql.*;

public class JdbcConnection {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3307/goodsDB?serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASS = "600591";

    public static Connection connection;

    public static void callConnection() throws SQLException {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Error while registering JDBC driver");
        }

        connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
