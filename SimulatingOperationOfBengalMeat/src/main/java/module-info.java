module com.example.simulatingoperationofbengalmeat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationofbengalmeat to javafx.fxml;
    exports com.example.simulatingoperationofbengalmeat;
}