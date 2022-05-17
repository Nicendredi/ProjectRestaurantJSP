package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySql {

    private static ConnectionMySql instance;
    private Connection con;

    private ConnectionMySql() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "28121987");
        ;
    }

    public static ConnectionMySql getInstance() throws ClassNotFoundException, SQLException {

        if (instance != null) {
            instance = new ConnectionMySql();
        }

        return instance;

    }

    public Connection getConnection() {

        return this.con;
    }

}
