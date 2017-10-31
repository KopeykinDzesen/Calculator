import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    JTextField textField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMultiply;
    JButton buttonDivide;

    public CalculatorFrame(String s){

        super(s);

        textField = new JTextField(25);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        button0 = new JButton("0");
        button0.setSize(50, 50);
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");

        add(textField);
        add(button0);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(buttonPlus);
        add(buttonMinus);
        add(buttonMultiply);
        add(buttonDivide);

        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setSize(300, 400);
        setResizable(false);
        setVisible(true);

    }

}
