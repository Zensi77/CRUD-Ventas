package com.jer.base_de_datos;

import java.sql.*;

/**
 * Clase que se encarga de la conexión a la base de datos y de obtener los datos de la misma.
 *
 * @author Juanma Espinola
 * @version 1.0
 * @date 2024/04/12
 */
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
