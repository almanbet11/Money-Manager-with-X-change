package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class InfoPageController implements Initializable{

    @FXML
    private Label firstNameLastName;

    @FXML
    private Label currencyType;

    @FXML
    private Label income;

    @FXML
    private Label expense;

    @FXML
    private Label balance;

    @FXML
    private Button incomeAddButton;

    @FXML
    private Button expenseAddButton;

    @FXML
    private ListView<?> expenseList;

    //It will take the value from previous class
    public void valueTakerFrom1stPage(String firstName, String lastName, int balance, String currencyType){
        this.firstNameLastName.setText(firstName +" "+ lastName);
        this.balance.setText("" + balance);
        this.currencyType.setText(currencyType);
    }

    public void valueTakerFromIncomePage(String firstName, String lastName, int balance, String currencyType, int income){
        this.income.setText(""+income);
    }

    public void valueTakerFromExpensePage(String fisrtName, String lastName, int balance, String currencyType, int income, int expense,
                                          ArrayList<String> historyOfExpense){}

    @FXML
    public void expenseAddButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("expenseRecordingPage.fxml"));
        Parent newPage = loader.load();

        Scene tableViewScene = new Scene(newPage);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    public void incomeAddButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("incomeRecordingPage.fxml"));
        Parent newPage = loader.load();

        Scene tableViewScene = new Scene(newPage);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        income.setText("0");
        expense.setText("0");
    }

}

