package com.example.cms;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class afterLogin {
    @FXML
    private Button logout;


    public void userlogOut(ActionEvent event)throws IOException{
        Parent Pane = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene sc = new Scene(Pane);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sc);
        stg.show();
    }
}
