module dBproj333 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens application to javafx.graphics, javafx.fxml, javafx.base;
}
