package com.jer.base_de_datos;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static com.jer.base_de_datos.StartController.cargaVentas;


public class Productos {

    private int id;
    private String nombre;
    private String descripcion;
    private int pvp;
    private Connection con;
    private Statement stmt;

    public Productos() {
        try {
            stmt = cargaVentas(false).createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean insertarProducto(int id, String nombre, String descripcion, int pvp, boolean insert) {
        boolean operacion = false;
        try {
            String sentencia;
            if (insert) {
                // Si es una operación de inserción, construimos la consulta INSERT
                sentencia = "INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('" + nombre + "','" + descripcion + "'," + pvp + ")";
            } else {
                // Si es una operación de actualización, construimos la consulta UPDATE
                sentencia = "UPDATE Productos SET nombre = '" + nombre + "', descripcion = '" + descripcion + "', PVP = " + pvp + " WHERE id = " + id;
            }

            int colAfectadas = stmt.executeUpdate(sentencia);
            if (colAfectadas >= 1) operacion = true;

        } catch (SQLException e) {
            operacion = false;
            e.printStackTrace();
        }
        return operacion;
    }

    public ResultSet getAllProducts() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Productos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean deleteProduct(int id) {
        boolean operacion = false;
        try {
            int colAfectadas = stmt.executeUpdate("DELETE FROM Productos WHERE id = " + id);
            if (colAfectadas >= 1) operacion = true;
        } catch (SQLException e) {
            operacion = false;
            e.printStackTrace();
        }
        return operacion;

    }

    public ResultSet getProducto(int id) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Productos WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public ResultSet busquedaProducto(String busqueda) {
        ResultSet rs = null;
        boolean isNumeric = busqueda.chars().allMatch(Character::isDigit); // Comprueba si la cadena es un número
        try {
            if (isNumeric) { // Si es un número, busca en el campo descripción y PVP
                rs = stmt.executeQuery("SELECT * FROM Productos WHERE nombre LIKE '%" + busqueda + "%'" + " OR descripcion LIKE '%" + busqueda + "%'" + " OR PVP LIKE '%" + busqueda + "%'");
            } else { // Si no es un número, busca en el campo nombre y descripción
                rs = stmt.executeQuery("SELECT * FROM Productos WHERE nombre LIKE '%" + busqueda + "%' OR descripcion LIKE '%" + busqueda + "%'");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }
}

