import javax.swing.*;
import java.awt.*;

public class InfoPage extends JFrame {

    private JTextField nameSurname;
    private JTextField currencyType;
    private JTextField income;
    private JTextField expense;
    private JTextField balance;
    private JButton ADDIncomeButton;
    private JButton ADDExpenseButton;
    private JTextArea historyOfExpenses;
    private JScrollBar scrollBar1;
    private JPanel secondPanel;

    public InfoPage(){
        super("Money Manager With Currency X-Change");
        setLayout(new FlowLayout());
        add(secondPanel);
    }

}




