import javax.swing.*;
import java.awt.*;

public class WelcomingPage extends JFrame {

    private JTextField name;
    private JTextField surname;
    private JRadioButton SOMRadioButton;
    private JRadioButton DOLLARRadioButton;
    private JRadioButton EURORadioButton;
    private JButton submitButton;
    private JButton cancelButton;
    private JPanel firstPanel;
    private JTextField textField1;

    public WelcomingPage(){
        super("Money Manager With Currency X-Change");
        setLayout(new FlowLayout());

        add(firstPanel);

    }

}
