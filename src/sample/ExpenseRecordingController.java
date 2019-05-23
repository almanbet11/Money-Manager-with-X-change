package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ExpenseRecordingController extends WelcomingPageController implements Initializable {

    @FXML
    private TextField expense;

    @FXML
    private TextField descriptionOfExpense;

    @FXML
    private Button saveButton;

    @FXML
    private Button exitButton;

    public int getExpense(){
        return Integer.parseInt(expense.getText());
    }

    public String getDescription(){
        return descriptionOfExpense.getText();
    }

    @FXML
    void cancelButtonPressed(ActionEvent event) throws IOException {}

    @FXML
    void saveButtonPressed(ActionEvent event) throws IOException {}

    @Override
    public void initialize(URL url, ResourceBundle rb){}

}
