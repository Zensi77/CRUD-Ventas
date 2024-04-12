module com.jer.base_de_datos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.jer.base_de_datos to javafx.fxml;
    exports com.jer.base_de_datos;
}