package com.jer.base_de_datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.jer.base_de_datos.StartController.cargaVentas;

public class Clientes {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;

    private Statement stmt;

    public Clientes() {
        crearTablas();
    }

    public void crearTablas() {
        try {
            stmt = cargaVentas(false).createStatement();


            stmt.execute("USE Ventas");
            stmt.execute("CREATE TABLE IF NOT EXISTS Clientes (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(50), apellido1 VARCHAR(50), apellido2 VARCHAR(50))");
            stmt.execute("CREATE TABLE IF NOT EXISTS Productos (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(50), descripcion VARCHAR(150), pvp INT)");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public int borrarBD() {
        int operacion = 1;
        try {
            stmt.execute("DROP DATABASE IF EXISTS Ventas");
            Thread.sleep(500);
            stmt.execute("CREATE DATABASE IF NOT EXISTS Ventas");
            crearTablas();
        } catch (SQLException | InterruptedException e) {
            operacion = -1;
            e.printStackTrace();
        }

        return operacion;
    }

    public int crearTabla() {

        int operacion;
        try (ResultSet rs = stmt.executeQuery("SHOW TABLES LIKE 'Compran'")) {

            if (!rs.next()) {
                stmt.execute("CREATE TABLE IF NOT EXISTS Compran (id INT AUTO_INCREMENT PRIMARY KEY, id_cliente INT, id_producto INT, cantidad INT, FOREIGN KEY (id_cliente) REFERENCES Clientes(id), FOREIGN KEY (id_producto) REFERENCES Productos(id) ON DELETE CASCADE ON UPDATE CASCADE)");
                operacion = 1;
            } else {
                operacion = 0;
            }
        } catch (SQLException e) {
            operacion = -1;
            e.printStackTrace();
        }
        return operacion;
    }

    public int borrarTabla(String tabla) {
        int operacion = 1;
        try {
            stmt.execute("DROP TABLE IF EXISTS Compran");
            stmt.execute("DROP TABLE " + tabla);
            switch (tabla) {
                case "Clientes":
                    stmt.execute("CREATE TABLE IF NOT EXISTS Clientes (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(50), apellido1 VARCHAR(50), apellido2 VARCHAR(50))");
                    break;
                case "Productos":
                    stmt.execute("CREATE TABLE IF NOT EXISTS Productos (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(50), descripcion VARCHAR(150), pvp INT)");
                    break;
                case "Compran":
                    stmt.execute("CREATE TABLE IF NOT EXISTS Compran (id INT AUTO_INCREMENT PRIMARY KEY, id_cliente INT, id_producto INT, cantidad INT, FOREIGN KEY (id_cliente) REFERENCES Clientes(id), FOREIGN KEY (id_producto) REFERENCES Productos(id)) ON DELETE CASCADE ON UPDATE CASCADE");
                    break;
            }

        } catch (SQLException e) {
            operacion = -1;
            e.printStackTrace();
        }
        return operacion;
    }


    public boolean insertarCliente(int id, String nombre, String apellido1, String apellido2, boolean insert) {
        boolean operacion = true;
        try {
            String sentencia;
            if (insert) {
                // Si es una operación de inserción, construimos la consulta INSERT
                sentencia = "INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('" + nombre + "','" + apellido1 + "','" + apellido2 + "')";
            } else {
                // Si es una operación de actualización, construimos la consulta UPDATE
                sentencia = "UPDATE Clientes SET nombre = '" + nombre + "', apellido1 = '" + apellido1 + "', apellido2 = '" + apellido2 + "' WHERE id = " + id;
            }

            int colAfectadas = stmt.executeUpdate(sentencia);
            if (colAfectadas >= 1) operacion = true;

        } catch (SQLException e) {
            operacion = false;
            e.printStackTrace();
        }
        return operacion;
    }

    public ResultSet getALLClientes() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Clientes");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public boolean deleteClient(int id) {
        boolean operacion = false;
        try {
            int colAfectadas = stmt.executeUpdate("DELETE FROM Clientes WHERE id = " + id);
            if (colAfectadas >= 1) operacion = true;
        } catch (SQLException e) {
            operacion = false;
            e.printStackTrace();
        }
        return operacion;
    }

    public ResultSet getCliente(int id) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Clientes WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public ResultSet getProductosComprados(int id) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT Productos.nombre, Productos.descripcion, Productos.pvp, Compran.cantidad FROM Productos INNER JOIN Compran ON Productos.id = Compran.id_producto WHERE Compran.id_cliente = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public ResultSet busquedaCliente(String busqueda) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Clientes WHERE nombre LIKE '%" + busqueda + "%' OR apellido1 LIKE '%" + busqueda + "%' OR apellido2 LIKE '%" + busqueda + "%'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean insertarCompra(int i, int idProducto, int cantidad) {
        boolean operacion = false;
        try {
            int colAfectadas = stmt.executeUpdate("INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (" + i + "," + idProducto + "," + cantidad + ")");
            if (colAfectadas >= 1) operacion = true;
            operacion = true;
        } catch (SQLException e) {
            operacion = false;
            e.printStackTrace();
        }

        return operacion;
    }
}
