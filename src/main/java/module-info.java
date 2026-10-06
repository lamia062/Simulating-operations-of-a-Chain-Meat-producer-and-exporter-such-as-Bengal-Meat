module com.example.forcopy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forcopy to javafx.fxml;
    exports com.example.forcopy;
}