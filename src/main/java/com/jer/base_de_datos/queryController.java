package com.jer.base_de_datos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.jer.base_de_datos.StartController.showAlert;

/**
 * Clase para controlar la vista de modificar o eliminar un producto o cliente
 * Se encarga de cargar los datos del producto o cliente a modificar o eliminar en la vista
 * También se encarga de modificar o eliminar el producto o cliente
 * Si es una consulta, muestra los productos comprados por el cliente
 *
 * @author Juanma Espinola
 * @version 1.0
 * @date 2024/04/12
 */
public class queryController {
    private Clientes cl = new Clientes();
    private Productos pr = new Productos();

    private int id;
    private String tipo;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private GridPane gridVentas;

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private TextField input3;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label titulo;

    @FXML
    private ImageView warning1;

    @FXML
    private ImageView warning2;

    @FXML
    private ImageView warning3;

    /**
     * Método para inicializar la vista
     * Se encarga de cargar los datos del producto o cliente a modificar o eliminar en la vista
     * Si es una consulta, muestra los productos comprados por el cliente
     * Si es un producto o cliente, muestra los datos del producto o cliente
     */
    @FXML
    public void initialize() {
        if (scrollPane != null) scrollPane.setVisible(false); // Ocultamos el scrollPane

        // Ocultamos los mensajes de error
        warning1.setVisible(false);
        warning2.setVisible(false);
        warning3.setVisible(false);

        gridVentas.setVisible(false); // Ocultamos la tabla de ventas

        if (this.tipo != null && this.tipo.equals(Constants.tipoVistaProducto)) { // Si es un producto
            ResultSet rs = pr.getProducto(this.id);
            try {
                while (rs.next()) { // Mostramos los datos del producto en los campos de texto
                    input1.setText(rs.getString(2));
                    input2.setText(rs.getString(3));
                    input3.setText(rs.getString(4));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (this.tipo != null && (this.tipo.equals(Constants.tipoVistaCliente) || this.tipo.equals(Constants.tipoVistaConsulta))) { // Si es un cliente o una consulta
            ResultSet rs = cl.getCliente(this.id);
            try {
                while (rs.next()) { // Mostramos los datos del cliente en los campos de texto
                    input1.setText(rs.getString(2));
                    input2.setText(rs.getString(3));
                    input3.setText(rs.getString(4));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (this.tipo != null && this.tipo.equals(Constants.tipoVistaConsulta)) { // Si es una consulta

            scrollPane.setVisible(true);
            gridVentas.setVisible(true);
            try {
                ResultSet rs = cl.getProductosComprados(this.id);
                while (rs.next()) { // Mostramos los productos comprados por el cliente en la tabla
                    gridVentas.addRow(
                            gridVentas.getRowCount(),
                            new Label(rs.getString(1)),
                            new Label(rs.getString(2)),
                            new Label(String.valueOf(rs.getInt(3))),
                            new Label(rs.getString(4))
                    );
                }
                scrollPane.setContent(gridVentas);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Método para modificar un producto o cliente en la base de datos
     * Se encarga de comprobar que los campos no estén vacíos y que el campo PVP sea un número entero
     * Si los campos son correctos, inserta el producto o cliente en la base de datos y muestra un mensaje de confirmación
     * Si no son correctos, muestra un mensaje de error
     */
    @FXML
    public void modify() {
        boolean correcto = true;

        // Comprobamos que los campos no estén vacíos
        if (input1.getText().isEmpty()) {
            warning1.setVisible(true);
            correcto = false;
        } else {
            warning1.setVisible(false);
        }

        if (input2.getText().isEmpty()) {
            warning2.setVisible(true);
            correcto = false;
        } else {
            warning2.setVisible(false);
        }

        if (input3.getText().isEmpty() || (!input3.getText().matches("[0-9]+") && tipo.equals(Constants.tipoVistaProducto))) { // Solo números enteros o vacío
            warning3.setVisible(true);
            correcto = false;
        } else {
            warning3.setVisible(false);
        }

        // Si los campos son correctos, insertamos el producto o cliente
        if (correcto) {
            if (tipo.equals(Constants.tipoVistaProducto)) { // Si es un producto
                if (pr.insertarProducto(this.id, input1.getText(), input2.getText(), Integer.parseInt(input3.getText()), false)) {
                    showAlert("Correcto", null, "Producto modificado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                    volverAtras(); // Volvemos a la vista anterior
                } else {
                    showAlert("Error", null, "Error al modificar el producto", Alert.AlertType.ERROR).showAndWait();
                }
            } else { // Si es un cliente
                if (cl.insertarCliente(this.id, input1.getText(), input2.getText(), input3.getText(), false)) {
                    showAlert("Correcto", null, "Cliente modificado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                    volverAtras(); // Volvemos a la vista anterior
                } else {
                    showAlert("Error", null, "Error al modificar el cliente", Alert.AlertType.ERROR).showAndWait();
                }
            }
        }
    }

    /**
     * Método para eliminar un producto o cliente
     * Se encarga de eliminar el producto o cliente y mostrar un mensaje de confirmación
     */
    @FXML
    public void eliminarProducto() {
        if (tipo.equals(Constants.tipoVistaProducto)) { // Si es un producto
            if (pr.deleteProduct(this.id)) {
                showAlert("Correcto", null, "Producto eliminado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                volverAtras(); // Volvemos a la vista anterior
            } else {
                showAlert("Error", null, "Error al eliminar el producto", Alert.AlertType.ERROR).showAndWait();
            }
        } else { // Si es un cliente
            if (cl.deleteClient(this.id)) {
                showAlert("Correcto", null, "Cliente eliminado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                volverAtras(); // Volvemos a la vista anterior
            } else {
                showAlert("Error", null, "Error al eliminar el cliente", Alert.AlertType.ERROR).showAndWait();
            }
        }
    }

    /**
     * Método para establecer el tipo de vista y el id del producto o cliente a modificar o eliminar en la vista
     *
     * @param datos Tipo de vista
     * @param id    Id del producto o cliente
     */
    public void setTipo(String datos, int id) {
        // Obtenemos la escena y la ventana actual para poder reescalarla
        Scene scene = this.titulo.getScene();
        Stage stage = (Stage) scene.getWindow();

        // Establecemos el tipo de vista y el id
        this.id = id;
        this.tipo = datos;
        if (datos.equals(Constants.tipoVistaCliente)) { // Si es un cliente
            titulo.setText(titulo.getText() + " clientes");
            label1.setText("Nombre");
            label2.setText("Apellido 1");
            label3.setText("Apellido 2");

            stage.setWidth(700);
            stage.setMaxHeight(400);

        } else if (datos.equals(Constants.tipoVistaProducto)) { // Si es un producto
            titulo.setText(titulo.getText() + " productos");
            label1.setText("Nombre");
            label2.setText("Descripcion");
            label3.setText("PVP");
            stage.setWidth(700);
            stage.setMaxHeight(400);

        } else if (datos.equals(Constants.tipoVistaConsulta)) { // Si es una consulta
            titulo.setText(titulo.getText() + " compras");
            label1.setText("Nombre");
            label2.setText("Apellido 1");
            label3.setText("Apellido 2");

            input1.setEditable(false);
            input2.setEditable(false);
            input3.setEditable(false);
        }
        initialize(); // Inicializamos la vista con los datos del producto o cliente a modificar o eliminar en la vista
        // esto es pq el initize se ejecuta antes de que se establezca el tipo y el id, por lo que no se cargan los datos
    }

    /**
     * Método para volver a la vista anterior
     * Se encarga de cargar la vista anterior y reescalar la ventana a su tamaño original si es necesario
     */
    @FXML
    public void volverAtras() {
        // Obtenemos la escena y la ventana actual para poder reescalarla
        Scene scene = this.titulo.getScene();
        Stage stage = (Stage) scene.getWindow();

        Scene scene1 = titulo.getScene();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventas-view.fxml"));
            scene1.setRoot(loader.load());
            VentasController controller = loader.getController();
            if (this.tipo.equals(Constants.tipoVistaProducto)) {
                // Si es un producto, mostramos la vista de productos, reescalando la ventana
                stage.setMaxHeight(Double.MAX_VALUE);
                stage.setWidth(720);
                stage.setHeight(600);


                controller.showProductos();
            } else if (this.tipo.equals(Constants.tipoVistaCliente) || this.tipo.equals(Constants.tipoVistaConsulta)) {
                // Si es un cliente, mostramos la vista de clientes, reescalando la ventana
                stage.setMaxHeight(Double.MAX_VALUE);
                stage.setWidth(720);
                stage.setHeight(600);

                controller.showClientes();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
