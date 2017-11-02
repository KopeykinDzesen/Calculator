import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLogics implements ActionListener{

    CalculatorFrame calculatorFrame;
    boolean isOperation;
    String operation;

    public ButtonLogics(CalculatorFrame calculatorFrame){
        this.calculatorFrame = calculatorFrame;
        isOperation = false;
    }

    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getActionCommand() == "clear"){
            calculatorFrame.textField.setText("");
            calculatorFrame.expression.delete(0, calculatorFrame.expression.length());
            isOperation = false;
        } else if (actionEvent.getActionCommand() == "="){
            calculatorFrame.textField.setText(calculateExpression(calculatorFrame.expression));
        } else if (actionEvent.getActionCommand() == "+" ||
                   actionEvent.getActionCommand() == "-" ||
                   actionEvent.getActionCommand() == "/" ||
                   actionEvent.getActionCommand() == "*"){
            if (!isOperation){
                calculatorFrame.expression.append(actionEvent.getActionCommand());
                calculatorFrame.textField.setText(calculatorFrame.expression.toString());
                isOperation = true;
                operation = actionEvent.getActionCommand();
            } else{
                JOptionPane.showMessageDialog(null, "Я не умею считать такие тяжёлые примеры!\n" +
                                                "Только одна операция!");
            }
        } else{
            calculatorFrame.expression.append(actionEvent.getActionCommand());
            calculatorFrame.textField.setText(calculatorFrame.expression.toString());
        }

    }

    private String calculateExpression(StringBuilder expression) {

        double result;
        double a = 0;
        double b = 0;

        for (int index = 0; index < expression.length(); index++){
            if (expression.charAt(index) == operation.charAt(0)){
                a = Double.parseDouble(expression.substring(0, index));
                b = Double.parseDouble(expression.substring(index + 1, expression.length()));
                break;
            }
        }

        switch (operation.charAt(0)){
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '/': result = a / b; break;
            case '*': result = a * b; break;
            default: return "";
        }

        return Double.toString(result);

    }

}
