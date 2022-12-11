package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class adminuserController {
    @FXML
    private Button loginbutton;

    @FXML
    private Button loginbutt;



    public void loginbuttonOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Stage window=(Stage) loginbutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }
    public void loginbutton1OnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Stage window=(Stage) loginbutt.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }
}
