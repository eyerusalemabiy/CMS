package com.example.cms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button loginbtn;

    @FXML
    private PasswordField passfield;

    @FXML
    private TextField usertext;

    @FXML
    private RadioButton studRadio;

    @FXML
    private ToggleGroup type;


    @FXML
    private RadioButton emp;


    @FXML
    private RadioButton adminRadio;

    public HelloController() {
    }

    @FXML
    void loginbtn(ActionEvent event) throws IOException {
/*if((usertext.getText().equals("new"))){
    System.out.println("login cssdasdf.");

    }
    else{
        System.out.println("nope....");
    }*/
        if(type.getSelectedToggle().equals(studRadio)) {
            if ((usertext.getText().equals("new")) && (passfield.getText().equals("yeab"))) {
                Parent Pane = FXMLLoader.load(getClass().getResource("student.fxml"));
                Scene sc = new Scene(Pane);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stg.setScene(sc);
                stg.show();
            }
        }
     /*  else if(type.getSelectedToggle().equals(studRadio)) {
            if ((usertext.getText().equals("new")) && (passfield.getText().equals("yeab"))) {
                Parent Pane = FXMLLoader.load(getClass().getResource("student.fxml"));
                Scene sc = new Scene(Pane);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stg.setScene(sc);
                stg.show();
            }
        }
        if(type.getSelectedToggle().equals(studRadio)) {
            if ((usertext.getText().equals("new")) && (passfield.getText().equals("yeab"))) {
                Parent Pane = FXMLLoader.load(getClass().getResource("student.fxml"));
                Scene sc = new Scene(Pane);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stg.setScene(sc);
                stg.show();
            }
        }*/
}
public void register(ActionEvent event) throws IOException {
    Parent Pane = FXMLLoader.load(getClass().getResource("reg.fxml"));
    Scene sc = new Scene(Pane);
    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stg.setScene(sc);
    stg.show();
}

    @FXML
    void cancel(ActionEvent event) {
        usertext.setText("");
        passfield.setText("");
    }
}
