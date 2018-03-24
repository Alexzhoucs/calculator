import javax.swing.*;

public class StartCalc {
    public static void main(String[] args){
        Calculator calculator = new Calculator(400, 550);
        calculator.setTitle("Calculator");
        calculator.getContentPane().setBackground(Helper.darkGrey);
        calculator.setLocationRelativeTo(null);
        calculator.setIcon("Config/t.jpg");
        calculator.setVisible(true);
    }
}
