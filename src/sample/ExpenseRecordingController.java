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

    @FXML
    void cancelButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("infoPage.fxml"));
        Parent newPage = loader.load();
        Scene tableViewScene = new Scene(newPage);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();

    }

    @FXML
    void saveButtonPressed(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){}

}
