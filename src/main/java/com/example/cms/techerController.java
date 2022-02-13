package com.example.cms;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


    public class techerController {

        @FXML
        private Button addscorebtn;

        @FXML
        private Pane techer;

        @FXML
        private Label techlabel;

        public techerController(Button addscorebtn) {
            this.addscorebtn = addscorebtn;
        }


    }