package com.jer.base_de_datos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import static com.jer.base_de_datos.StartController.showAlert;


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
    private Label txt1;

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

    @FXML
    private void initialize() {
        warningNombre.setVisible(false);
        warningApe1.setVisible(false);
        warningApe2.setVisible(false);
    }

    @FXML
    private void guardar() {
        initialize();
        if (campo1.getText().isEmpty()) {
            warningNombre.setVisible(true);
        } if (campo2.getText().isEmpty()) {
            warningApe1.setVisible(true);
        } if (campo3.getText().isEmpty() || !campo3.getText().matches("[0-9]+")) {
            warningApe2.setVisible(true);
        } else if (datos.equals(Constants.tipoVistaCliente)) {
            Clientes cl = new Clientes();
            if (cl.insertarCliente(0, campo1.getText(), campo2.getText(), campo3.getText(), true)) {
                showAlert("Correcto", null, "Cliente insertado correctamente", Alert.AlertType.INFORMATION).showAndWait();
                Stage miVentana = (Stage) buttonGuardar.getScene().getWindow();
                miVentana.close();
            } else {
                showAlert("Error", null, "Error al insertar el cliente", Alert.AlertType.ERROR).showAndWait();
            }
        } else if (datos.equals(Constants.tipoVistaProducto)) {
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


    @FXML
    private void cancelar() {
        Stage miVentana = (Stage) buttonCancelar.getScene().getWindow();
        miVentana.close();
    }

    public void setTipo(String datos) {
        this.datos = datos;
        if (datos.equals(Constants.tipoVistaCliente)) {
            txtPrincipal.setText(txtPrincipal.getText() + " clientes");
        } else if (datos.equals(Constants.tipoVistaProducto)) {
            txtPrincipal.setText(txtPrincipal.getText() + " productos");
            txt2.setText("Descripcion");
            txt3.setText("PVP");
        }
    }

}

