package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomingPageController implements Initializable {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField balance;

    @FXML
    private RadioButton somRB;

    @FXML
    private RadioButton dollarRB;

    @FXML
    private RadioButton euroRB;

    @FXML
    private RadioButton yuanRB;

    @FXML
    private Button submitButton;

    @FXML
    private Button exitButton;

    public void submitButtonPressed(){}

    public void cancelButtonPressed(){}

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }

}
