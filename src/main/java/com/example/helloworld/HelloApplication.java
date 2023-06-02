package com.example.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader Root = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(Root.load(), 400, 600);
        //Cargar la hoja de estilos CSS
        String css=HelloApplication.class.getResource("styles/app.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Hola FX + CSS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}