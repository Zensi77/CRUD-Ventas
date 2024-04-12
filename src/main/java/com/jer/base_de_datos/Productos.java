package com.jer.base_de_datos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.jer.base_de_datos.StartController.cargaVentas;


public class Productos {

    private Statement stmt;

    /**
     * Constructor de la clase Productos
     * Inicializa el objeto Statement para poder realizar consultas a la base de datos
     */
    public Productos() {
        try {
            stmt = cargaVentas(false).createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para insertar un producto en la base de datos
     * Si insert es true, se inserta un nuevo producto
     * Si insert es false, se actualiza un producto existente
     *
     * @param id          Identificador del producto
     * @param nombre      Nombre del producto
     * @param descripcion Descripción del producto
     * @param pvp         Precio de venta al público
     * @param insert      Indica si la operación es de inserción o actualización
     * @return Devuelve true si la operación se ha realizado correctamente, false en caso contrario
     */
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

    /**
     * Método para obtener todos los productos de la base de datos
     *
     * @return Devuelve un ResultSet con todos los productos
     */
    public ResultSet getAllProducts() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Productos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * Método para eliminar un producto de la base de datos por su identificador
     *
     * @param id Identificador del producto a eliminar
     * @return Devuelve true si la operación se ha realizado correctamente, false en caso contrario
     */
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

    /**
     * Método para obtener un producto de la base de datos por su identificador
     *
     * @param id Identificador del producto a obtener
     * @return Devuelve un ResultSet con el producto
     */
    public ResultSet getProducto(int id) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Productos WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    /**
     * Método para buscar un producto en la base de datos por su nombre, descripción o precio
     *
     * @param busqueda Cadena de texto a buscar
     * @return Devuelve un ResultSet con los productos encontrados
     */
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

