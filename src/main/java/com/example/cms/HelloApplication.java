package com.example.cms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage primarystage) throws IOException {
        stg =primarystage;
        primarystage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primarystage.setTitle("Course Management System!");
        primarystage.setScene(scene);
        primarystage.show();
    }



    public static void main(String[] args) {
        new DbConnection().connMethod();
        launch();
    }
}