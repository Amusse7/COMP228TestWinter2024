module com.example.comp228testwinter2024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.comp228testwinter2024 to javafx.fxml;
    exports com.example.comp228testwinter2024;
}