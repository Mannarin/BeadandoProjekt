package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
@Log4j2

public class CalorieCalcController {
    @FXML
    private TextField product;

    @FXML
    private TextField gramm;

    @FXML
    private Label kcal;

    @FXML
    private Label fat;

    @FXML
    private Label carbo;

    @FXML
    private Label prot;

    public void nextScene(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/chooseCalculator.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        log.info("Back to Choose Calculator Button was pressed.");
    }

    public void logDailyCal(ActionEvent event) {
  /*  Button button = (Button) event.getSource();

        if(button.getId().equals("logButt")) {
        }
        }*/
    }

}