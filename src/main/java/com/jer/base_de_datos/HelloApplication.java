package com.jer.base_de_datos;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase que inicia la aplicacion
 *
 * @version 1.0
 * @autor Juanma Espinola
 * @date 2024/04/12
 */
public class HelloApplication extends Application {
    @FXML
    private static Scene scene;

    /**
     * Metodo que inicia la aplicacion
     *
     * @param stage Ventana principal
     * @throws IOException Excepcion de entrada/salida
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("start-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Conexion a Base de datos");
        stage.setMinHeight(260);
        stage.setMaxHeight(260);
        stage.setMinWidth(448);
        stage.setMaxWidth(448);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    /**
     * Metodo que carga la vista
     *
     * @param fxml Vista a cargar
     * @throws IOException Excepcion de entrada/salida
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Metodo que carga el archivo fxml
     *
     * @param fxml
     * @return Devuelve el archivo fxml
     * @throws IOException
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}