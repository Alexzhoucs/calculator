import javax.swing.*;

public class StartCalc {
    public static void main(String[] C){
        Calculator calculator = new Calculator(450, 680);
        calculator.setTitle("Calculator");
        calculator.getContentPane().setBackground(Helper.darkGrey);
        calculator.setLocationRelativeTo(null);
        calculator.setIcon("Config/t.jpg");
        calculator.setVisible(true);
    }
}
