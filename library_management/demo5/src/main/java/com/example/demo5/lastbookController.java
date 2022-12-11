package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;


public class lastbookController {
    @FXML
    private Button prevbookslide;
    @FXML
    private Button backdashboard;
    @FXML
    private Button requestbook;

    public void lastbookOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("showbook.fxml"));
        Stage window=(Stage) prevbookslide.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }
    public void backdashOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        Stage window=(Stage) backdashboard.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }
    public void requestbookOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("requestbook.fxml"));
        Stage window=(Stage) requestbook.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }
}
