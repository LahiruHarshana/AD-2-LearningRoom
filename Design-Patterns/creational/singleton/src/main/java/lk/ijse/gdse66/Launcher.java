package lk.ijse.gdse66;

import lk.ijse.gdse66.db.DBConnection;

/**
 * @author : L.H.J
 * @File: Launcher
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class Launcher {

    public static void main(String[] args) {
        //DBConnection dbConnection = new DBConnection();
        try {
            DBConnection.getInstance().getConnection();
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
