module com.example.javafxtesti {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtesti to javafx.fxml;
    exports com.example.javafxtesti;
}