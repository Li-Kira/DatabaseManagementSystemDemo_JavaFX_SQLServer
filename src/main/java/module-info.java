module com.gui.sqldemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;



    opens com.gui.sqldemo to javafx.fxml;
    opens com.table to javafx.fxml;

    exports com.gui.sqldemo;
}