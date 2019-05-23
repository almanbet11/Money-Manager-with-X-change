package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

import java.net.URL;
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
    public void valueTaker(String firstName, String lastName, int balance, String currencyType){
        this.firstNameLastName.setText(firstName +" "+ lastName);
        this.balance.setText("" + balance);
        this.currencyType.setText(currencyType);
    }

    @FXML
    public void expenseAddButtonPressed(ActionEvent event) {

    }

    @FXML
    public void incomeAddButtonPressed(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        income.setText("0");
        expense.setText("0");
    }

}

