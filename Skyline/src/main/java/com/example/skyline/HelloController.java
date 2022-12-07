
package com.example.skyline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Button CancelButton;
    @FXML
    private Label LoginMessageLabel;
    @FXML
    private TextField UsernameTextField;
    @FXML
    private PasswordField passwordPasswordField;

    public void LoginButtonOnAction(ActionEvent e) {

        if(UsernameTextField.getText().isBlank()== false && passwordPasswordField.getText().isBlank()== false) {
            //LoginMessageLabel.setText("You try to login!!");

            validateLogin();

        }else {
            LoginMessageLabel.setText("Please Enter Username and Password");
        }
    }

    public void CancelButtonOnAction(ActionEvent e) {
        Stage stage= (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }
    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM skyline.skyline WHERE username = ' " + UsernameTextField.getText() + " ' AND password = '" + passwordPasswordField.getText() +" '";

        try {

          Statement statement = connectDB.createStatement();
          ResultSet queryResult = statement.executeQuery(verifyLogin);

          while(queryResult.next()) {
              if (queryResult.getInt(1) == 1) {
                  LoginMessageLabel.setText("Welcome!");

              } else {
                  LoginMessageLabel.setText("Invalid Login.Please try again.");

              }
          }

        }catch (Exception e) {
            e.printStackTrace();

        }

    }
}