package com.jer.base_de_datos;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import static com.jer.base_de_datos.Constants.rutaImgLapiz;
import static com.jer.base_de_datos.StartController.showAlert;

public class VentasController {
    @FXML
    private ScrollPane miScrollPane;

    @FXML
    private GridPane gridProductos;

    @FXML
    private GridPane gridClientes;

    @FXML
    private Button guardarCompra;

    @FXML
    private Button insertCompran;

    @FXML
    private Button insertProductos;

    @FXML
    private Label labelPrincipal;

    @FXML
    private Button queryArticle;

    @FXML
    private Button queryCliente;

    @FXML
    private Button showArticles;

    @FXML
    private TextField busqueda;

    @FXML
    private ImageView busquedaImg;

    @FXML
    private Label idClientes;

    private GridPane gridBusqueda = new GridPane();

    private Clientes cl;
    private Productos pr;

    private HelloApplication helloApplication = new HelloApplication();

    @FXML
    public void initialize() {
        //Inicialmente oculto las tablas
        gridClientes.setVisible(false);
        gridProductos.setVisible(false);
        guardarCompra.setVisible(false);
        idClientes.setVisible(false); // label invisible para el idCliente al guardar una compra

        cl = new Clientes(); // En este modelo de datos, la clase Clientes es la que se encarga de crear la base de datos y las tablas, ya que es el primero que se llama
        pr = new Productos();
    }

    @FXML
    public void createCompran(ActionEvent event) {
        int res = cl.crearTabla();
        if (res == 1) {
            showAlert("Crear Tabla", null, "Tabla Compran creada con éxito", Alert.AlertType.INFORMATION).showAndWait();
        } else if (res == -1) {
            showAlert("Error", null, "Error al crear la tabla Compran", Alert.AlertType.ERROR).showAndWait();
        } else {
            showAlert("Error", null, "La tabla Compran ya existe", Alert.AlertType.ERROR).showAndWait();
        }
    }

    @FXML
    public void insertCliente(ActionEvent event) {
        guardarCompra.setVisible(false); // Oculto el botón de guardar compra
        idClientes.setText(""); // Borro el id del cliente para poder realizar una nueva compra

        Pair<Stage, InsertDatosController> ventanaModal = createWindow("insertDatos-view", "Insertar Cliente", true, 600, 382);
        Stage stage = ventanaModal.getKey();
        InsertDatosController insertController = ventanaModal.getValue();

        stage.setMaxHeight(300);
        stage.setMinHeight(300);
        stage.setMaxWidth(320);
        stage.setMinWidth(320);
        insertController.setTipo(Constants.tipoVistaCliente);
        stage.showAndWait();
    }

    @FXML
    public void insertProductos(ActionEvent event) {
        guardarCompra.setVisible(false); // Oculto el botón de guardar compra
        idClientes.setText(""); // Borro el id del cliente para poder realizar una nueva compra

        // Creo una ventana modal para insertar productos
        Pair<Stage, InsertDatosController> ventanaModal = createWindow("insertDatos-view", "Insertar Productos", true, 600, 238);
        Stage stage = ventanaModal.getKey();
        InsertDatosController insertController = ventanaModal.getValue();

        stage.setMaxHeight(300);
        stage.setMinHeight(300);
        stage.setMaxWidth(320);
        stage.setMinWidth(320);
        insertController.setTipo(Constants.tipoVistaProducto);
        stage.showAndWait();
    }

    @FXML
    public void showProductos() throws SQLException {
        labelPrincipal.setText("Productos");
        gridProductos.setVisible(true);
        gridClientes.setVisible(false);
        gridBusqueda.setVisible(false);

        gridProductos.getChildren().removeIf(node -> GridPane.getRowIndex(node) != null && GridPane.getRowIndex(node) > 1);

        // añado un scrollPane para que se pueda ver la tabla entera
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(gridProductos);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        ResultSet rs = pr.getAllProducts();
        while (rs.next()) {
            int id = rs.getInt(1);

            ImageView lapizImg = new ImageView("file:" + rutaImgLapiz);
            lapizImg.setFitHeight(Constants.prefHeightButtonGrid);
            lapizImg.setFitWidth(Constants.prefWitdhButtonGrid);
            lapizImg.setOnMouseClicked((MouseEvent event) -> {
                obtenerDatos(id, Constants.tipoVistaProducto);
            });

            CheckBox checkBox = new CheckBox();
            checkBox.setId(String.valueOf(id));

            HBox container = new HBox(); // Creo un contenedor para el checkbox y la imagen

            if (idClientes.getText().isEmpty()) { // Si no hay un cliente seleccionado, no muestro el checkbox ni el spinner
                container.getChildren().add(lapizImg);
            } else { // Si hay un cliente seleccionado, muestro el checkbox y el spinner para poder añadir productos a la compra
                container.getChildren().add(checkBox);

                Spinner<Integer> spinner = new Spinner<>(1, 100, 0);
                spinner.setPrefWidth(50);
                container.getChildren().add(spinner);
            }

            // Añado los elementos a la tabla de productos
            gridProductos.addRow(
                    gridProductos.getRowCount(),
                    container,
                    new Label(String.valueOf(id)),
                    new Label(rs.getString(2)),
                    new Label(rs.getString(3)),
                    new Label(String.valueOf(rs.getInt(4)))
            );
        }
        miScrollPane.setContent(gridProductos);
    }


    @FXML
    public void showClientes() {
        labelPrincipal.setText("Clientes");
        gridClientes.setVisible(true);
        gridProductos.setVisible(false);
        gridBusqueda.setVisible(false);
        guardarCompra.setVisible(false);
        idClientes.setText(""); // Borro el id del cliente para poder realizar una nueva compra

        gridClientes.getChildren().removeIf(node -> GridPane.getRowIndex(node) != null && GridPane.getRowIndex(node) > 1);

        ResultSet rs = cl.getALLClientes();
        try {
            while (rs.next()) {
                int id = rs.getInt(1);

                ImageView lapizImg = new ImageView("file:" + Constants.rutaImgLapiz);
                lapizImg.setFitHeight(20);
                lapizImg.setFitWidth(20);
                lapizImg.setOnMouseClicked((MouseEvent event) -> {
                    obtenerDatos(id, Constants.tipoVistaCliente);
                });

                ImageView carritoCompraImg = new ImageView("file:" + Constants.rutaImgCarrito);
                carritoCompraImg.setFitHeight(Constants.prefHeightButtonGrid);
                carritoCompraImg.setFitWidth(Constants.prefWitdhButtonGrid);
                carritoCompraImg.setOnMouseClicked((MouseEvent event) -> {
                    try {
                        realizarCompra(id);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

                ImageView ojoImg = new ImageView("file:" + Constants.rutaImgOjo);
                ojoImg.setFitHeight(Constants.prefHeightButtonGrid);
                ojoImg.setFitWidth(Constants.prefWitdhButtonGrid);
                ojoImg.setOnMouseClicked((MouseEvent event) -> {
                    obtenerVentas(id);
                });
                HBox container = new HBox(lapizImg); // Creo un contenedor para el checkbox y la imagen
                container.getChildren().add(ojoImg);
                container.getChildren().add(carritoCompraImg);
                container.setSpacing(3); // Espacio entre los elementos

                // Añado los elementos a la tabla de clientes
                gridClientes.addRow(
                        gridClientes.getRowCount(),
                        container,
                        new Label(String.valueOf(id)),
                        new Label(rs.getString(2)),
                        new Label(rs.getString(3)),
                        new Label(rs.getString(4))
                );
            }

            miScrollPane.setContent(gridClientes);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void guardarCompra() {
        ObservableList<Node> objects = gridProductos.getChildren(); // Obtengo todos los nodos de la tabla de productos

        boolean res = true;

        for (Node node : objects) { // Recorro todos los nodos de la tabla de productos
            if (node instanceof HBox) { // Si el nodo es un HBox, es porque contiene un checkbox y un spinner
                HBox hBox = (HBox) node;
                CheckBox checkBox = (CheckBox) hBox.getChildren().get(0);
                if (checkBox.isSelected()) { // Si el checkbox está seleccionado, es porque el producto se ha añadido a la compra
                    int idProducto = Integer.parseInt(checkBox.getId());
                    // Obtengo el valor del spinner
                    Spinner<Integer> spinner = (Spinner<Integer>) hBox.getChildren().get(1);
                    int cantidad = spinner.getValue();
                    res = cl.insertarCompra(Integer.parseInt(idClientes.getText()), idProducto, cantidad);
                }
            }
        }

        if (res) {
            showAlert("Compra", null, "Compra realizada con éxito", Alert.AlertType.INFORMATION).showAndWait();
            showClientes();
        } else {
            showAlert("Error", null, "Error al realizar la compra", Alert.AlertType.ERROR).showAndWait();
        }
    }

    private void realizarCompra(int id) throws SQLException {
        idClientes.setText(String.valueOf(id)); // Guardo el id del cliente para poder realizar la compra
        guardarCompra.setVisible(true); // Muestro el botón de agregar compra
        showProductos();
    }

    private void obtenerDatos(int id, String tipo) {
        try {
            Scene scene = labelPrincipal.getScene();
            //cambio la vista a la ventana de consultas
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventanaConsultas-view.fxml"));
            scene.setRoot(loader.load());
            queryController controller = loader.getController();
            controller.setTipo(tipo, id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void obtenerVentas(int id) {
        try {
            Scene scene = labelPrincipal.getScene();
            //cambio la vista a la ventana de consultas
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventanaConsultas-view.fxml"));
            scene.setRoot(loader.load());
            queryController controller = loader.getController();
            controller.setTipo(Constants.tipoVistaConsulta, id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void busqueda() {
        gridClientes.setVisible(false);
        gridProductos.setVisible(false);
        labelPrincipal.setText("Busqueda");
        gridBusqueda.setVisible(true);
        guardarCompra.setVisible(false);
        idClientes.setText(""); // Borro el id del cliente para poder realizar una nueva compra

        if (busqueda.getText().isEmpty()) {
            showAlert("Error", null, "Introduce un valor para buscar", Alert.AlertType.ERROR).showAndWait();
        } else {
            String busqueda = this.busqueda.getText();
            ResultSet rsProducto = pr.busquedaProducto(busqueda);
            ResultSet rsCliente = cl.busquedaCliente(busqueda);

            try {

                gridBusqueda.setHgap(10);

                gridBusqueda.getChildren().removeIf(node -> GridPane.getRowIndex(node) != null); //? Borro todos los elementos de la tabla
                if (rsProducto != null) {

                    Label titulo = new Label("Productos");
                    titulo.setStyle("-fx-font-weight: bold; -fx-font-size: 20");

                    gridBusqueda.addRow(0, titulo);
                    gridBusqueda.addRow(1, new Label(), new Label("ID"), new Label("Nombre"), new Label("Descripcion"), new Label("PVP"));

                    while (rsProducto.next()) {
                        int id = rsProducto.getInt(1);

                        ImageView lapizImg = new ImageView("file:" + Constants.rutaImgLapiz);
                        lapizImg.setFitHeight(Constants.prefHeightButtonGrid);
                        lapizImg.setFitWidth(Constants.prefWitdhButtonGrid);
                        lapizImg.setOnMouseClicked((MouseEvent event) -> {
                            obtenerDatos(id, Constants.tipoVistaProducto);
                        });

                        ImageView productoImg = new ImageView("file:" + Constants.rutaImgProducto);
                        productoImg.setFitHeight(Constants.prefHeightButtonGrid);
                        productoImg.setFitWidth(Constants.prefWitdhButtonGrid);

                        HBox container = new HBox(productoImg); // Creo un contenedor para todas las imagenes
                        container.getChildren().add(lapizImg);

                        gridBusqueda.addRow(
                                gridBusqueda.getRowCount(),
                                container,
                                new Label(String.valueOf(id)),
                                new Label(rsProducto.getString(2)),
                                new Label(rsProducto.getString(3)),
                                new Label(String.valueOf(rsProducto.getInt(4))
                                ));
                    }
                }

                if (rsCliente != null) {
                    Label titulo = new Label("Clientes");
                    titulo.setStyle("-fx-font-weight: bold; -fx-font-size: 20");
                    titulo.setPrefSize(100, 20);

                    gridBusqueda.addRow(gridBusqueda.getRowCount(), titulo);
                    gridBusqueda.addRow(gridBusqueda.getRowCount(), new Label(), new Label("ID"), new Label("Nombre"), new Label("Apellido 1"), new Label("Apellido 2"));

                    while (rsCliente.next()) {
                        int id = rsCliente.getInt(1);

                        ImageView lapizImg = new ImageView("file:" + Constants.rutaImgLapiz);
                        lapizImg.setFitHeight(Constants.prefHeightButtonGrid);
                        lapizImg.setFitWidth(Constants.prefWitdhButtonGrid);
                        lapizImg.setOnMouseClicked((MouseEvent event) -> {
                            obtenerDatos(id, Constants.tipoVistaCliente);
                        });

                        ImageView clienteImg = new ImageView("file:" + Constants.rutaImgCliente);
                        clienteImg.setFitHeight(Constants.prefHeightButtonGrid);
                        clienteImg.setFitWidth(Constants.prefWitdhButtonGrid);

                        ImageView ojoImg = new ImageView("file:" + Constants.rutaImgOjo);
                        ojoImg.setFitHeight(Constants.prefHeightButtonGrid);
                        ojoImg.setFitWidth(Constants.prefWitdhButtonGrid);
                        ojoImg.setOnMouseClicked((MouseEvent event) -> {
                            obtenerVentas(id);
                        });

                        ImageView carritoCompraImg = new ImageView("file:" + Constants.rutaImgCarrito);
                        carritoCompraImg.setFitHeight(Constants.prefHeightButtonGrid);
                        carritoCompraImg.setFitWidth(Constants.prefWitdhButtonGrid);
                        carritoCompraImg.setOnMouseClicked((MouseEvent event) -> {
                            try {
                                realizarCompra(id);
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        });

                        HBox container = new HBox(clienteImg); // Creo un contenedor para todas las imagenes
                        container.getChildren().add(lapizImg);
                        container.getChildren().add(ojoImg);
                        container.getChildren().add(carritoCompraImg);

                        gridBusqueda.addRow(
                                gridBusqueda.getRowCount(),
                                container,
                                new Label(String.valueOf(id)),
                                new Label(rsCliente.getString(2)),
                                new Label(rsCliente.getString(3)),
                                new Label(rsCliente.getString(4))
                        );
                    }
                }
                miScrollPane.setContent(gridBusqueda);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    //! Metodos del menu
    @FXML
    public void conectarBD(ActionEvent event) {
        Stage paginaVentas = (Stage) labelPrincipal.getScene().getWindow();
        paginaVentas.close();

        Stage stage = createWindow("start-view", "Conexion a Base de datos", false, 200, 220).getKey();
        stage.setMinHeight(260);
        stage.setMaxHeight(260);
        stage.setMinWidth(448);
        stage.setMaxWidth(448);

        stage.show();
    }

    @FXML
    public void restablecerBD(ActionEvent event) {
        if (mostrarConfirmation("Restablecer Base de Datos", null, "¿Está seguro de que desea restablecer la Base de Datos?", Alert.AlertType.CONFIRMATION)) { // Si el usuario pulsa aceptar, borramos el fichero
            if (cl.borrarBD() == 1) {
                showAlert("Restablecer Base de Datos", null, "Base de Datos restablecida con éxito", Alert.AlertType.INFORMATION).showAndWait();
            } else {
                showAlert("Error", null, "Error al restablecer la Base de Datos", Alert.AlertType.ERROR).showAndWait();
            }
        }
    }

    @FXML
    public void deleteTabla(ActionEvent event) {
        MenuItem buttonClicked = (MenuItem) event.getSource();
        int res;
        if (buttonClicked.getText().equals("Productos")) {
            res = cl.borrarTabla("Productos");
        } else if (buttonClicked.getText().equals("Clientes")) {
            res = cl.borrarTabla("Clientes");
        } else {
            res = cl.borrarTabla("Compran");
        }

        if (res == 1) {
            showAlert("Borrar Tabla", null, "Tabla borrada con éxito", Alert.AlertType.INFORMATION).showAndWait();
        } else {
            showAlert("Error", null, "Error al borrar la tabla", Alert.AlertType.ERROR).showAndWait();
        }
    }

    @FXML
    public void aboutAs(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        String text = menuItem.getText();

        String url = "";

        if (text.equals("GitHub")) {
            url = "https://github.com/Zensi77";
        } else if (text.equals("Linkedin")) {
            url = "https://www.linkedin.com/in/juan-manuel-espinola-rodriguez/";
        }

        if (mostrarConfirmation("Redes Sociales", null, "¿Desea abrir el enlace en el navegador?", Alert.AlertType.CONFIRMATION)) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }

        }

    }

    private boolean mostrarConfirmation(String title, String header, String content, Alert.AlertType type) {
        boolean confirmation = false;
        Alert alert = showAlert(title, header, content, type);

        alert.getButtonTypes().clear();
        alert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);

        Optional<ButtonType> resultado = alert.showAndWait();

        if (resultado.isPresent() && resultado.get() == ButtonType.YES) {
            confirmation = true;
        }

        return confirmation;
    }

    public <T> Pair<Stage, T> createWindow(String fxml, String title, boolean modal, int width, int height) {
        Stage stage = null;
        T controller = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml + ".fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage = new Stage();

            controller = loader.getController();

            if (title != null) stage.setTitle(title);

            stage.setScene(scene);
            if (modal) stage.initModality(Modality.APPLICATION_MODAL);

            if (width > 0 && height > 0) {
                stage.setWidth(width);
                stage.setHeight(height);
            }
        } catch (IOException e) {
            System.err.println("Error al abrir la ventana " + fxml);
        }
        return new Pair<>(stage, controller);
    }

}

