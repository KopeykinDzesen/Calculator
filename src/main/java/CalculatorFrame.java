import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    StringBuilder expression;

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
    JButton buttonComma;
    JButton buttonEquals;
    JButton buttonClear;

    public CalculatorFrame(String s){

        super(s);

        expression = new StringBuilder();
        ButtonLogics buttonLogics = new ButtonLogics(this);

        textField = new JTextField(20);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        button0 = new JButton("0");
        button0.setActionCommand("0");
        button0.addActionListener(buttonLogics);

        button1 = new JButton("1");
        button1.setActionCommand("1");
        button1.addActionListener(buttonLogics);

        button2 = new JButton("2");
        button2.setActionCommand("2");
        button2.addActionListener(buttonLogics);

        button3 = new JButton("3");
        button3.setActionCommand("3");
        button3.addActionListener(buttonLogics);

        button4 = new JButton("4");
        button4.setActionCommand("4");
        button4.addActionListener(buttonLogics);

        button5 = new JButton("5");
        button5.setActionCommand("5");
        button5.addActionListener(buttonLogics);

        button6 = new JButton("6");
        button6.setActionCommand("6");
        button6.addActionListener(buttonLogics);

        button7 = new JButton("7");
        button7.setActionCommand("7");
        button7.addActionListener(buttonLogics);

        button8 = new JButton("8");
        button8.setActionCommand("8");
        button8.addActionListener(buttonLogics);

        button9 = new JButton("9");
        button9.setActionCommand("9");
        button9.addActionListener(buttonLogics);

        buttonPlus = new JButton("+");
        buttonPlus.setActionCommand("+");
        buttonPlus.addActionListener(buttonLogics);

        buttonMinus = new JButton("-");
        buttonMinus.setActionCommand("-");
        buttonMinus.addActionListener(buttonLogics);

        buttonMultiply = new JButton("*");
        buttonMultiply.setActionCommand("*");
        buttonMultiply.addActionListener(buttonLogics);

        buttonDivide = new JButton("/");
        buttonDivide.setActionCommand("/");
        buttonDivide.addActionListener(buttonLogics);

        buttonComma = new JButton(".");
        buttonComma.setActionCommand(".");
        buttonComma.addActionListener(buttonLogics);

        buttonEquals = new JButton("=");
        buttonEquals.setActionCommand("=");
        buttonEquals.addActionListener(buttonLogics);

        buttonClear = new JButton("clear");
        buttonClear.setActionCommand("clear");
        buttonClear.addActionListener(buttonLogics);

        add(textField);
        add(button7);
        add(button8);
        add(button9);
        add(buttonDivide);
        add(buttonMultiply);
        add(button4);
        add(button5);
        add(button6);
        add(buttonMinus);
        add(buttonPlus);
        add(button1);
        add(button2);
        add(button3);
        add(buttonComma);
        add(buttonEquals);
        add(button0);
        add(buttonClear);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(250, 185);
        setResizable(false);
        setVisible(true);

    }

}
