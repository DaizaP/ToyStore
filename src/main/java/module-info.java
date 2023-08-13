module com.ex.toystore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ex.toystore to javafx.fxml;
    exports com.ex.toystore;
}