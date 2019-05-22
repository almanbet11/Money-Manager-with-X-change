package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class InfoPageController {

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

    @FXML
    public void expenseAddButtonPressed(ActionEvent event) {

    }

    @FXML
    public void incomeAddButtonPressed(ActionEvent event) {

    }

}

