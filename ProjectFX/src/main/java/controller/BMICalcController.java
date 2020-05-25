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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import model.BMICalculator;

import java.io.IOException;
@Log4j2

public class BMICalcController {

    @FXML
    private Label bminfo;

    @FXML
    private TextField year;

    @FXML
    private TextField weight;

    @FXML
    private TextField height;

    @FXML
    private Label bmi;

    private BMICalculator bmiCalculator;

    @FXML
    public void initialize(){
        bmiCalculator=new BMICalculator();
    }

    public void calcBMI(ActionEvent event){
        bmi.setText(bmiCalculator.calculateBMI(weight.getText(),height.getText()));
        bminfo.setText(bmiCalculator.chartBMI(year.getText(),bmi.getText()));
    }

    public void nextScene(ActionEvent event) throws IOException {
        Button button=(Button) event.getSource();

        if(button.getId().equals("backButt")){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/chooseCalculator.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        log.info("Back to Choose Calculator Button was pressed.");
    }}


}
