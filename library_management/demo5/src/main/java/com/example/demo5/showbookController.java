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


public class showbookController {
    @FXML
    private Button nextbookslide;

    @FXML
    private Button subtle;

    @FXML
    private Button uglylove;
    @FXML
    private Button backdashboard;
    public void showbookOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lastbook.fxml"));
        Stage window=(Stage) nextbookslide.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }

    public void subtleOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("subtle.fxml"));
        Stage window=(Stage) nextbookslide.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }

    public void backdashOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        Stage window=(Stage) backdashboard.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }
    private Button prev;

    public void uglyloveOnAction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ugly love.fxml"));
        Stage window=(Stage) uglylove.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));
    }
}
