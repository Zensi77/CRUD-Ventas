package com.jer.base_de_datos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

/**
 * Clase que se encarga de establecer la conexión con la base de datos
 * y de cargar las ventanas de la aplicación
 *
 * @author Juanma Espinola
 * @version 1.0
 * @date 2024-04-12
 */
public class StartController {
    @FXML
    private TextField direccion, user, password;

    private Datos datos = new Datos();

    /**
     * Método que se ejecuta al pulsar el botón de seleccionar base de datos
     * o el botón de usar la base de datos ventas
     *
     * @param event
     */
    @FXML
    public void selectDb(ActionEvent event) {
        Button clickedButton = (Button) event.getSource(); // Vamos a ver que boton es el que se ha presionado
        if (clickedButton.getText().equals("Aceptar")) { // Si se ha presionado el boton de seleccionar base de datos
            cargarBD();
        } else if (clickedButton.getText().equals("Usar base de datos ventas")) { // Si se ha presionado el boton de base de datos estandar
            if (cargaVentas(true) != null) cargarVentana("ventas-view");
        }
    }

    /**
     * Método que se encarga de cargar la base de datos Ventas
     *
     * @param message boolean que indica si se debe mostrar un mensaje de éxito o no
     * @return con Connection con la base de datos Ventas
     */
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

    /**
     * Método que se encarga de cargar la base de datos introducida por el usuario
     * Al establecer la conexión con la base de datos, se muestra un dialogo con un comboBox con las bases de datos
     *
     * @return con Connection con la base de datos introducida por el usuario
     */
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
                    dialog.setHeight(200);
                    dialog.showAndWait();

                    // Creo la conexión con la base de datos seleccionada
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + comboBox.getValue(), user.getText(), password.getText());

                    if (con != null) {
                        showAlert("Conexión", null, "Conexión establecida con éxito", Alert.AlertType.INFORMATION).showAndWait();
                        showAlert("Funcion no implementada", null, "Lamentablemente esta función esta disponiblw.\nEsta funcion sera implementada en proximas versiones de la aplicacion", Alert.AlertType.INFORMATION).showAndWait();
                    }
                }
            } catch (SQLException e) {
                showAlert("Error", null, "Debes seleccionar la base de datos a la que deseas conectar", Alert.AlertType.ERROR).showAndWait();
            }
        }
    }

    /**
     * Método que se encarga de cargar las ventanas de la aplicación
     *
     * @param fxml nombre del archivo fxml
     */
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

    /**
     * Método que se encarga de mostrar un mensaje de alerta
     *
     * @param title     título del mensaje
     * @param header    cabecera del mensaje
     * @param content   contenido del mensaje
     * @param alertType tipo de mensaje
     * @return alerta
     */
    public static Alert showAlert(String title, String header, String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);

        return alert;
    }
}