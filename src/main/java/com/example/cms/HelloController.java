package com.example.cms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button loginbtn;

    @FXML
    private PasswordField passfield;

    @FXML
    private TextField usertext;

    @FXML
    void loginbtn(ActionEvent event) {
if((usertext.getText().equals("new"))){
    System.out.println("login cssdasdf.");

    }
    else{
        System.out.println("nope....");
    }


}
public void register(){

}

}
