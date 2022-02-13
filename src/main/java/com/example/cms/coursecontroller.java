package com.example.cms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class coursecontroller {

    @FXML
    private Button addbtn;

    @FXML
    private Label courselabel;

    @FXML
    private Button managebtn;

    @FXML
    void addMtd(ActionEvent event) throws IOException {
        Parent Pane = FXMLLoader.load(getClass().getResource("addcourse.fxml"));
        Scene sc = new Scene(Pane);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(sc);
        stg.show();
    }

    @FXML
    void manageMtd(ActionEvent event) throws IOException {
        Parent Pane = FXMLLoader.load(getClass().getResource("managecourse.fxml"));
        Scene sc = new Scene(Pane);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(sc);
        stg.show();
    }

}
