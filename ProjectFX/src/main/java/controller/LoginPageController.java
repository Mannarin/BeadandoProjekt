package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.log4j.Log4j2;
import model.Product;
import util.ProductDao;

import java.io.IOException;
@Log4j2
public class LoginPageController {

    @FXML
    private TextField login;

    @FXML
    private Label warningText;


    public void nextScene(ActionEvent event) throws IOException {
        if (login.getText().isEmpty()) {
            warningText.setText(" You must give your username.");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/chooseCalculator.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            log.info("Next to Choose Calculator Button was pressed.");
        }
    }
    }


