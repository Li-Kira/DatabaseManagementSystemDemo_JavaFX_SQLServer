package com.table;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("source_table.fxml"));
        Scene scene = new Scene(root, 1080, 600);
        Stage TableStage = new Stage();
        // TableStage.initStyle(StageStyle.UNDECORATED);
        TableStage.setScene(scene);
        TableStage.show();
    }
}