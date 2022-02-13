package com.example.cms;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.PasswordField;
        import javafx.scene.control.TextField;

        import java.io.IOException;

public class Login {

    @FXML
    private Button canclbtn;

    @FXML
    private Button loginbtn;

    @FXML
    private PasswordField passfield;

    @FXML
    private Button regbtn;

    @FXML
    private TextField usertext;

    @FXML
    void register(ActionEvent event) {

    }

    @FXML
    void userLogin(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException{
        HelloApplication h = new HelloApplication();
        if(usertext.getText ().isEmpty() && passfield.getText().isEmpty()){
            System.out.println("success");
//            h.changeScence("afterLogin.fxml");
        }
        else if(usertext.getText().isEmpty() && passfield.getText().isEmpty()){
            System.out.println("please Enter Your Data");
        }
        else{
            System.out.println("Wrong Username Or Password");
        }
    }

}
