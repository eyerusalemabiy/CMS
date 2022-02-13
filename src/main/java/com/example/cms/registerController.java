package com.example.cms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.*;
public class registerController {

    @FXML
    private Button addbtn;

    @FXML
    private Button canbtn;

    @FXML
    private TextField confirm;

    @FXML
    private Label coniftext;

    @FXML
    private TextField passfield;

    @FXML
    private Label passtext;

    @FXML
    private TextField username;

    @FXML
    private Label usetext;

    @FXML
    void add(ActionEvent event) {
if(username.getText().equals("")||passfield.getText().equals("")|| confirm.getText().equals("")){

        JOptionPane.showMessageDialog(null,"please fill all the requirments....");
}
else if(!passfield.getText().equals(confirm.getText())){
    JOptionPane.showMessageDialog(null,"password and confirmation is not the same..");
}
else if(passfield.getText().equals(confirm.getText())){
    String name = username.getText();
    String pass = passfield.getText();

    JOptionPane.showMessageDialog(null,"added successfully....");
}

    }

    @FXML
    void cancel(ActionEvent event) {
        username.setText("");
        passfield.setText("");
        confirm.setText("");

    }

}
