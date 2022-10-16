module com.pdbt.thuchanh {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pdbt.thuchanh to javafx.fxml;
    exports com.pdbt.thuchanh;
}
