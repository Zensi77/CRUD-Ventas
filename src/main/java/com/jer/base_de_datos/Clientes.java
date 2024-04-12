package com.jer.base_de_datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.jer.base_de_datos.StartController.cargaVentas;

/**
 * Clase que se encarga de gestionar los clientes de la base de datos
 * Permite insertar, actualizar, borrar y buscar clientes en la base de datos
 * También permite insertar compras realizadas por los clientes
 * Además, se encarga de crear las tablas necesarias en la base de datos
 * y de borrar la base de datos o las tablas de la base de datos
 *
 * @author Juanma Espinola
 * @version 1.0
 * @date 2024/04/12
 */
public class Clientes {

    private Statement stmt;

    /**
     * Constructor de la clase Clientes
     * Se encarga de crear las tablas necesarias en la base de datos
     */
    public Clientes() {
        crearTablas();
    }

    /**
     * Método que crea las tablas necesarias en la base de datos
     */
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

    /**
     * Método que borra la base de datos y la vuelve a crear
     * Se utiliza para reiniciar la base de datos y los datos almacenados
     *
     * @return 1 si la operación se ha realizado correctamente, -1 si ha habido algún error
     */
    public int borrarBD() {
        int operacion = 1;
        try {
            stmt.execute("DROP DATABASE IF EXISTS Ventas");
            Thread.sleep(500); // Esperamos medio segundo para que se borre la base de datos
            stmt.execute("CREATE DATABASE IF NOT EXISTS Ventas");
            crearTablas();
        } catch (SQLException | InterruptedException e) {
            operacion = -1;
            e.printStackTrace();
        }

        return operacion;
    }

    /**
     * Método que crea la tabla Compran en la base de datos si no existe
     * Se utiliza para almacenar las compras realizadas por los clientes
     *
     * @return 1 si la operación se ha realizado correctamente, 0 si la tabla ya existía, -1 si ha habido algún error
     */
    public int crearTabla() {
        int operacion;
        // Usamos un try-with-resources para cerrar el ResultSet automáticamente al finalizar y evitar problemas de memoria
        try (ResultSet rs = stmt.executeQuery("SHOW TABLES LIKE 'Compran'")) { // Comprobamos si la tabla Compran ya existe
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

    /**
     * Método que borra una tabla de la base de datos
     * Se utiliza para borrar la tabla Clientes, Productos o Compran
     *
     * @param tabla Nombre de la tabla a borrar
     * @return 1 si la operación se ha realizado correctamente, -1 si ha habido algún error
     */
    public int borrarTabla(String tabla) {
        int operacion = 1;
        try {
            stmt.execute("DROP TABLE IF EXISTS Compran"); // Borramos la tabla Compran si existe para evitar problemas de claves foráneas
            // Asumo que si no hay clientes o productos, no va a haber compras, por lo que no es necesario borrar la tabla Compran
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

    /**
     * Método que inserta un cliente en la base de datos
     * Se utiliza para insertar un nuevo cliente o actualizar los datos de un cliente existente
     *
     * @param id        Identificador del cliente
     * @param nombre    Nombre del cliente
     * @param apellido1 Primer apellido del cliente
     * @param apellido2 Segundo apellido del cliente
     * @param insert    Indica si la operación es de inserción (true) o de actualización (false)
     * @return true si la operación se ha realizado correctamente, false si ha habido algún error
     */
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

    /**
     * Método que devuelve todos los clientes almacenados en la base de datos
     * Se utiliza para mostrar los datos de los clientes en la tabla de la interfaz gráfica
     *
     * @return ResultSet con los datos de los clientes
     */
    public ResultSet getALLClientes() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Clientes");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    /**
     * Método que borra un cliente de la base de datos
     *
     * @param id Identificador del cliente a borrar
     * @return true si la operación se ha realizado correctamente, false si ha habido algún error
     */
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

    /**
     * Método que devuelve los datos de un cliente en concreto
     *
     * @param id
     * @return ResultSet con los datos del cliente
     */
    public ResultSet getCliente(int id) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Clientes WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    /**
     * Método que devuelve los productos comprados por un cliente en concreto
     * Se utiliza para mostrar los productos comprados por un cliente en la tabla de la interfaz gráfica
     *
     * @param id Identificador del cliente
     * @return ResultSet con los productos comprados por el cliente
     */
    public ResultSet getProductosComprados(int id) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT Productos.nombre, Productos.descripcion, Productos.pvp, Compran.cantidad FROM Productos INNER JOIN Compran ON Productos.id = Compran.id_producto WHERE Compran.id_cliente = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    /**
     * Método que busca un cliente en la base de datos
     * Se utiliza para buscar un cliente por su nombre o apellidos
     *
     * @param busqueda Nombre o apellidos del cliente a buscar
     * @return ResultSet con los datos del cliente encontrado
     */
    public ResultSet busquedaCliente(String busqueda) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM Clientes WHERE nombre LIKE '%" + busqueda + "%' OR apellido1 LIKE '%" + busqueda + "%' OR apellido2 LIKE '%" + busqueda + "%'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * Método que inserta una compra en la base de datos
     * Se utiliza para insertar una nueva compra realizada por un cliente
     *
     * @param id         Identificador del cliente
     * @param idProducto Identificador del producto comprado
     * @param cantidad   Cantidad de productos comprados
     * @return true si la operación se ha realizado correctamente, false si ha habido algún error
     */
    public boolean insertarCompra(int id, int idProducto, int cantidad) {
        boolean operacion = false;
        try {
            int colAfectadas = stmt.executeUpdate("INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (" + id + "," + idProducto + "," + cantidad + ")");
            if (colAfectadas >= 1) operacion = true;
            operacion = true;
        } catch (SQLException e) {
            operacion = false;
            e.printStackTrace();
        }

        return operacion;
    }
}
