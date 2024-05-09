package lk.ijse.gdse66.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : L.H.J
 * @File: DBConnection
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class DBConnection {

    private static DBConnection dbConnection;
    private final Connection con;

    private DBConnection() throws SQLException {
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gdse66",
                "root",
                "12345678"
        );
    }


    public static DBConnection getInstance() throws SQLException {
        return (null == dbConnection) ? dbConnection = new DBConnection()
                : dbConnection;
    }

    public Connection getConnection() {
        return con;
    }

}
