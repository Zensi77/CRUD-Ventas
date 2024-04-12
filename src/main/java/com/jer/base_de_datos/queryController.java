package com.jer.base_de_datos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.jer.base_de_datos.StartController.showAlert;


public class queryController {
    private Clientes cl = new Clientes();
    private Productos pr = new Productos();

    private int id;
    private String tipo;

    @FXML
    private Button buttonEliminar;

    @FXML
    private Button buttonModify;

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

    @FXML
    public void initialize() {
        if (scrollPane != null) scrollPane.setVisible(false);
        warning1.setVisible(false);
        warning2.setVisible(false);
        warning3.setVisible(false);

        gridVentas.setVisible(false);

        if (this.tipo != null && this.tipo.equals(Constants.tipoVistaProducto)) {
            ResultSet rs = pr.getProducto(this.id);
            try {
                while (rs.next()) {
                    input1.setText(rs.getString(2));
                    input2.setText(rs.getString(3));
                    input3.setText(rs.getString(4));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (this.tipo != null && (this.tipo.equals(Constants.tipoVistaCliente) || this.tipo.equals(Constants.tipoVistaConsulta))) {
            ResultSet rs = cl.getCliente(this.id);
            try {
                while (rs.next()) {
                    input1.setText(rs.getString(2));
                    input2.setText(rs.getString(3));
                    input3.setText(rs.getString(4));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (this.tipo != null && this.tipo.equals(Constants.tipoVistaConsulta)) {

            scrollPane.setVisible(true);
            gridVentas.setVisible(true);
            try {
                ResultSet rs = cl.getProductosComprados(this.id);
                while (rs.next()) {
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

    public void modify() {
        boolean correcto = true;
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

        if (input3.getText().isEmpty()) {
            warning3.setVisible(true);
            correcto = false;
        } else {
            warning3.setVisible(false);
        }

        if (correcto) {
            if (tipo.equals(Constants.tipoVistaProducto)) {
                if (pr.insertarProducto(this.id, input1.getText(), input2.getText(), Integer.parseInt(input3.getText()), false)) {
                    showAlert("Correcto", null, "Producto modificado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                    volverAtras(null);
                } else {
                    showAlert("Error", null, "Error al modificar el producto", Alert.AlertType.ERROR).showAndWait();
                }
            } else {
                if (cl.insertarCliente(this.id, input1.getText(), input2.getText(), input3.getText(), false)) {
                    showAlert("Correcto", null, "Cliente modificado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                    volverAtras(null);
                } else {
                    showAlert("Error", null, "Error al modificar el cliente", Alert.AlertType.ERROR).showAndWait();
                }
            }
        }
    }


    public void eliminarProducto() {
        if (tipo.equals(Constants.tipoVistaProducto)) {
            if (pr.deleteProduct(this.id)) {
                showAlert("Correcto", null, "Producto eliminado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                volverAtras(null);
            } else {
                showAlert("Error", null, "Error al eliminar el producto", Alert.AlertType.ERROR).showAndWait();
            }
        } else {
            if (cl.deleteClient(this.id)) {
                showAlert("Correcto", null, "Cliente eliminado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                volverAtras(null);
            } else {
                showAlert("Error", null, "Error al eliminar el cliente", Alert.AlertType.ERROR).showAndWait();
            }
        }
    }

    public void setTipo(String datos, int id) {
        Scene scene = this.titulo.getScene();
        Stage stage = (Stage) scene.getWindow();

        this.id = id;
        this.tipo = datos;
        if (datos.equals(Constants.tipoVistaCliente)) {
            titulo.setText(titulo.getText() + " clientes");
            label1.setText("Nombre");
            label2.setText("Apellido 1");
            label3.setText("Apellido 2");

            stage.setWidth(700);
            stage.setMaxHeight(400);

        } else if (datos.equals(Constants.tipoVistaProducto)) {
            titulo.setText(titulo.getText() + " productos");
            label1.setText("Nombre");
            label2.setText("Descripcion");
            label3.setText("PVP");
            stage.setWidth(700);
            stage.setMaxHeight(400);

        } else if (datos.equals(Constants.tipoVistaConsulta)) {
            titulo.setText(titulo.getText() + " compras");
            label1.setText("Nombre");
            label2.setText("Apellido 1");
            label3.setText("Apellido 2");

            input1.setEditable(false);
            input2.setEditable(false);
            input3.setEditable(false);
        }

        initialize();
    }

    public void volverAtras(MouseEvent mouseEvent) {
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
