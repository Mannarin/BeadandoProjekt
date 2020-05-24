package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseCalcController {

    public void nextScene(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();

        if(button.getId().equals("chooseBmiButt"))
        {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/bmiCalc.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        }
        else if (button.getId().equals("chooseCalButt"))
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/caloreiCalc.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
        else if ( button.getId().equals("chooseback"))
                {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/loginpage.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}
