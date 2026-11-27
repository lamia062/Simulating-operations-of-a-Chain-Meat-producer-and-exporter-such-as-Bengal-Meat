module com.example.forcopy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forcopy to javafx.fxml;
    exports com.example.forcopy;
    exports com.example.forcopy.ProductionManager;
    opens com.example.forcopy.ProductionManager to javafx.fxml;
}