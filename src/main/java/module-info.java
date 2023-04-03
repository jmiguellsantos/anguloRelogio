module com.example.relogioangulo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.relogioangulo to javafx.fxml;
    exports com.example.relogioangulo;
}