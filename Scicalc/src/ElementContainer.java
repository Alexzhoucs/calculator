import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

class ElementContainer extends JFrame {
    Map<String, ButtonHolder> buttonHolderMap;
    private JPanel keyPad = new JPanel();
    JTextField outputDisplay = new JTextField();
    JTextField inputDisplay = new JTextField();

    ElementContainer(int width, int height) {		
        this.setSize(width, height);
        this.setBackground(Helper.darkGrey);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.buttonHolderMap = ButtonHolder.getAll();
        this.setupDisplay();
        this.setupKeyPad();
    }

    private void setupDisplay() {		
        JPanel screen = new JPanel();
        screen.setLayout(null);
        int screenHeight = (int) (this.getHeight() * Helper.SCREEN_RATIO);
        this.add(screen).setBounds(0, 0, this.getWidth(), screenHeight);
        screen.add(inputDisplay);
        int inputDisplayHeight = (int) (screen.getHeight() * Helper.INPUT_DISPLAY_RATIO);
        this.inputDisplay.setBounds(0, 0, screen.getWidth(), inputDisplayHeight);
        this.inputDisplay.setHorizontalAlignment(JTextField.LEFT);
        this.inputDisplay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        this.inputDisplay.setText("0");
        this.inputDisplay.setEditable(false);
        this.inputDisplay.setBackground(Helper.WHITE);
        this.inputDisplay.setForeground(Color.BLACK);
        screen.add(this.outputDisplay);
        int outputDisplayHeight = (int) (screen.getHeight() * Helper.OUTPUT_DISPLAY_RATIO);
        this.outputDisplay.setBounds(0, inputDisplayHeight, screen.getWidth(), outputDisplayHeight);
        this.outputDisplay.setHorizontalAlignment(JTextField.LEFT);
        this.outputDisplay.setFont(Helper.SCREEN_FONT);
        this.outputDisplay.setText("0");
        this.outputDisplay.setEditable(false);
        this.outputDisplay.setBackground(Helper.WHITE);
        this.outputDisplay.setForeground(Color.BLACK);
    }

    private void setupKeyPad() {			
        ArrayList<String> mapKeys = ButtonHolder.getMapKeysByType(this.buttonHolderMap, "numeric");
        this.prepareButtons(mapKeys, Helper.KEY_FONT_MD, Helper.GREY);
        mapKeys = ButtonHolder.getMapKeysByType(this.buttonHolderMap, "operator");
        this.prepareButtons(mapKeys, Helper.KEY_FONT_MD, Helper.WHITE);
        mapKeys = ButtonHolder.getMapKeysByType(this.buttonHolderMap, "number_modifier");
        this.prepareButtons(mapKeys, Helper.KEY_FONT_MD, Helper.GREY);
        mapKeys = ButtonHolder.getMapKeysByType(this.buttonHolderMap, "answer");
        this.prepareButtons(mapKeys, Helper.KEY_FONT_MD, Helper.GREEN);
        this.prepareButtonByKey("exit", Helper.KEY_FONT_MD, Helper.RED);
        this.prepareButtonByKey("clear", Helper.KEY_FONT_MD, Helper.LIGHT_BLUE);
        this.prepareButtonByKey("delete", Helper.KEY_FONT_MD, Color.YELLOW);
        mapKeys = ButtonHolder.getMapKeysByType(this.buttonHolderMap, "single_operator");
        this.prepareButtons(mapKeys, Helper.KEY_FONT_MD, Helper.WHITE);
        this.prepareButtonByKey("percent", Helper.KEY_FONT_MD, Helper.GREY);
        this.keyPad = new JPanel();
        int keyPadY = (int) (this.getHeight() * Helper.SCREEN_RATIO);
        int keyPadHeight = (int) (this.getHeight() * Helper.KEYPAD_RATIO);
        this.add(this.keyPad).setBounds(0, keyPadY, this.getWidth(), keyPadHeight);
        this.keyPad.setLayout(null);
        this.keyPad.setBackground(Helper.darkGrey);
        this.fixButtonsPlacement();

    }


    private void prepareButtons(ArrayList<String> buttonHolderMapKeys, Font font, Color bgColor) {
        for (String key : buttonHolderMapKeys) {
            this.prepareButtonByKey(key, font, bgColor);
        }
    }

    private void prepareButtonByKey(String key, Font font, Color bgColor) {
        this.buttonHolderMap.get(key).setFont(font);
        this.buttonHolderMap.get(key).setBackground(bgColor);
        this.buttonHolderMap.get(key).setFocusable(false);
    }

    private void fixButtonsPlacement() {			
        int btnWidth = this.keyPad.getWidth() / Helper.BUTTON_PER_LINE;							
        this.keyPad.add(this.buttonHolderMap.get("clear")).setBounds(btnWidth, 0, btnWidth, Helper.BUTTON_HEIGHT);
        this.keyPad.add(this.buttonHolderMap.get("delete")).setBounds(2*btnWidth, 0, btnWidth, Helper.BUTTON_HEIGHT);
        this.keyPad.add(this.buttonHolderMap.get("exit")).setBounds(0,0,btnWidth, Helper.BUTTON_HEIGHT);
        this.keyPad.add(this.buttonHolderMap.get("equal")).setBounds(3*btnWidth,0,btnWidth, Helper.BUTTON_HEIGHT);
        String[] commonButtons = {"1", "2", "3", "add",  "4", "5", "6", "sub", "7", "8", "9", "mul", "point", "0","percent", "div","e","PI",
        		"rand","oppo"};
        this.setButtonByKeyList(commonButtons,9* Helper.BUTTON_HEIGHT);
        String[] scientificButtons = {"ln", "log","exp","pow","square", "cube", "sqrt","cbrt","sin", "cos", "tan","toRad","asin",
        		"acos", "atan","toDeg",  "sinh", "cosh", "tanh","signum","max","min","round","mod","abs","one_by_n","ceil","floor","hypot"
        		,"expm1","log1p", "scalb"};
        this.setButtonByKeyList(scientificButtons, Helper.BUTTON_HEIGHT);
    }

    private void setButtonByKeyList(String[] buttonsKeys, int startY){
        int btnPerLine = Helper.BUTTON_PER_LINE;
        int btnWidth = this.keyPad.getWidth() / btnPerLine;
        int btnHeight = Helper.BUTTON_HEIGHT;
        int extraBlock = this.totalExtraBlock(buttonsKeys.length, btnPerLine);
        int rowCounter = 0, colCounter = 0, counter = 0;
        for(String buttonKey: buttonsKeys){
            int x = colCounter * btnWidth, y = rowCounter * btnHeight + startY;
                this.keyPad.add(this.buttonHolderMap.get(buttonKey)).setBounds(x, y, btnWidth, btnHeight);
                counter++;
            rowCounter = counter % btnPerLine == 0 ? rowCounter + 1 : rowCounter;
            colCounter = counter % btnPerLine == 0 ? 0 : colCounter + 1;
        }
    }

    private int totalExtraBlock(int numberOfBtn, int btnPerLine){
        return numberOfBtn - (numberOfBtn % btnPerLine);
    }

    void setIcon(String iconPath){		
        ImageIcon img = new ImageIcon(iconPath);
        this.setIconImage(img.getImage());
    }
}
