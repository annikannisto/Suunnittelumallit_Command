package org.example.suunnittelumallit_command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PixelArtEditorApplication extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        PixelArtEditorGUI pixelArtEditor = new PixelArtEditorGUI();
        root.setCenter(pixelArtEditor.getGridPane());
        root.setBottom(pixelArtEditor.getCreateCodeButton());

        Scene scene = new Scene(root, 400, 450);
        scene.setOnKeyPressed(pixelArtEditor::handleKeyPress);
        stage.setScene(scene);
        stage.setTitle("Pixel Art Editor");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}