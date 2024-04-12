package com.jer.base_de_datos;

import com.jer.base_de_datos.Datos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;

public class StartController {
    @FXML
    private TextField direccion, user, password;

    @FXML
    private Button selectdB;

    @FXML
    private Button standardB;

    private Datos datos = new Datos();

    @FXML
    public void selectDb(ActionEvent event) {
        Statement stmt = null;
        Button clickedButton = (Button) event.getSource(); // Vamos a ver que boton es el que se ha presionado
        if (clickedButton.getText().equals("Aceptar")) { // Si se ha presionado el boton de seleccionar base de datos
            cargarBD();
        } else if (clickedButton.getText().equals("Usar base de datos ventas")) { // Si se ha presionado el boton de base de datos estandar
            if (cargaVentas(true) != null) cargarVentana("ventas-view");
        }
    }

    @FXML
    public static Connection cargaVentas(boolean message) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ventas", "root", "root");
            if (con != null && message) {
                showAlert("Conexión", null, "Conexión establecida con éxito", Alert.AlertType.INFORMATION).showAndWait();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error", null, "Error al conectar con la base de datos", Alert.AlertType.ERROR).showAndWait();
        }
        return con;
    }

    public void cargarBD() {
        if (user.getText().isEmpty() || password.getText().isEmpty()) {
            showAlert("Error", null, "Debe rellenar todos los campos", Alert.AlertType.ERROR).showAndWait();
        } else {
            try {
                String url;
                if (direccion.getText().isEmpty()) { // Si no se ha introducido una dirección, se pone por defecto localhost
                    direccion.setText("localhost");
                    url = "jdbc:mysql://" + direccion.getText() + ":3306";
                } else { // Si se ha introducido una dirección, se pone la dirección introducida
                    url = "jdbc:mysql://" + direccion.getText() + ":3306";
                }
                Connection con = DriverManager.getConnection(url, user.getText(), password.getText());
                if (con != null) {

                    // Consulto las bases de datos que hay en el servidor MySQL para que el usuario pueda seleccionar una
                    ResultSet rs = datos.getBasesDeDatos(direccion.getText(), user.getText(), password.getText());
                    TextInputDialog dialog = new TextInputDialog();
                    dialog.setTitle("Seleccione una Base de datos");
                    dialog.setHeaderText("Seleccione una Base de datos de la lista");

                    // Creo un comboBox con las bases de datos que hay en el servidor MySQL,para que el usuario pueda seleccionar una
                    ComboBox<String> comboBox = new ComboBox<>();
                    while (rs.next()) {
                        comboBox.getItems().add(rs.getString(1));
                    }
                    comboBox.setCursor(javafx.scene.Cursor.HAND);
                    comboBox.setPrefHeight(30);
                    comboBox.setPrefWidth(30);
                    dialog.getDialogPane().setContent(comboBox);
                    dialog.setWidth(300);
                    dialog.setHeight(50);
                    dialog.showAndWait();

                    // Creo la conexión con la base de datos seleccionada
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + comboBox.getValue(), user.getText(), password.getText());

                    if (con != null) {
                        showAlert("Conexión", null, "Conexión establecida con éxito", Alert.AlertType.INFORMATION).showAndWait();
                    }
                }
            } catch (SQLException e) {
                showAlert("Error", null, "Error al conectar con la base de datos", Alert.AlertType.ERROR).showAndWait();
            }
        }
    }

    private void cargarVentana(String fxml) {
        // Cerramos la ventana actual
        Stage paginaPrincipal = (Stage) direccion.getScene().getWindow();
        paginaPrincipal.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml + ".fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setTitle("Conexion a Base de datos Ventas");
            stage.setScene(scene);
            stage.setMinHeight(600);
            stage.setMinWidth(720);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Alert showAlert(String title, String header, String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);

        return alert;
    }
}