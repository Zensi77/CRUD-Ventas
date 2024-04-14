package com.jer.base_de_datos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import static com.jer.base_de_datos.StartController.showAlert;

/**
 * Controlador de la ventana de inserción de datos
 * Se encarga de insertar los datos en la base de datos
 *
 * @author Juanma Espinola
 * @version 1.0
 * @date 2024/04/12
 */
public class InsertDatosController {
    private String datos;

    @FXML
    ImageView warningNombre, warningApe1, warningApe2;

    @FXML
    private TextField campo1;

    @FXML
    private TextField campo2;

    @FXML
    private TextField campo3;

    @FXML
    private Label txt2;

    @FXML
    private Label txt3;

    @FXML
    private Label txtPrincipal;

    @FXML
    private Button buttonGuardar;

    @FXML
    private Button buttonCancelar;

    /**
     * Inicializa la ventana de inserción de datos
     */
    @FXML
    private void initialize() {
        // Ocultamos los warnings
        warningNombre.setVisible(false);
        warningApe1.setVisible(false);
        warningApe2.setVisible(false);
    }

    /**
     * Guarda los datos introducidos en la ventana de inserción
     * Si los datos son correctos, se insertan en la base de datos
     * Si no, se muestra el warning correspondiente
     */
    @FXML
    private void guardar() {
        initialize();
        if (campo1.getText().isEmpty()) {
            warningNombre.setVisible(true);
        }
        if (campo2.getText().isEmpty()) {
            warningApe1.setVisible(true);
        }
        if (campo3.getText().isEmpty() || (!campo3.getText().matches("[0-9]+") && datos.equals(Constants.tipoVistaProducto))) { // Solo números enteros o vacío
            warningApe2.setVisible(true);
        } else if (datos.equals(Constants.tipoVistaCliente)) { // Si es un cliente
            Clientes cl = new Clientes();
            if (cl.insertarCliente(0, campo1.getText(), campo2.getText(), campo3.getText(), true)) {
                showAlert("Correcto", null, "Cliente insertado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                Stage miVentana = (Stage) buttonGuardar.getScene().getWindow();
                miVentana.close();
            } else {
                showAlert("Error", null, "Error al insertar el cliente", Alert.AlertType.ERROR).showAndWait();
            }
        } else if (datos.equals(Constants.tipoVistaProducto)) { // Si es un producto
            Productos pr = new Productos();
            if (pr.insertarProducto(0, campo1.getText(), campo2.getText(), Integer.parseInt(campo3.getText()), true)) {
                initialize();
                showAlert("Correcto", null, "Producto insertado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                Stage miVentana = (Stage) buttonGuardar.getScene().getWindow();
                miVentana.close();
            } else {
                showAlert("Error", null, "Error al insertar el producto", Alert.AlertType.ERROR).showAndWait();
            }
        }
    }

    /**
     * Cierra la ventana de inserción de datos
     * Se ejecuta al pulsar el botón de cancelar
     */
    @FXML
    private void cancelar() {
        Stage miVentana = (Stage) buttonCancelar.getScene().getWindow();
        miVentana.close();
    }

    /**
     * Establece el tipo de datos que se van a insertar y ajusta los textos de la ventana
     * Se ejecuta al abrir la ventana de inserción
     *
     * @param datos Tipo de datos
     */
    public void setTipo(String datos) {
        this.datos = datos;
        if (datos.equals(Constants.tipoVistaCliente)) { // Si son clientes
            txtPrincipal.setText(txtPrincipal.getText() + " clientes");
        } else if (datos.equals(Constants.tipoVistaProducto)) { // Si son productos
            txtPrincipal.setText(txtPrincipal.getText() + " productos");
            txt2.setText("Descripcion");
            txt3.setText("PVP");
        }
    }

}

