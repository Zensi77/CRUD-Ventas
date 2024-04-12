package com.jer.base_de_datos;

import java.sql.*;

public class Datos {

    private Connection con;
    private Statement stmt;

    public ResultSet getBasesDeDatos(String url, String user, String password) {
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + url + ":3306", user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SHOW DATABASES");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
