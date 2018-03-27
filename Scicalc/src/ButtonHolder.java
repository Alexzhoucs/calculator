import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ButtonHolder extends JButton{
    String type; 
    String pureName; 
    String screenText; 

    private ButtonHolder(String type, String pureName, String buttonText, String screenText) {
        super(buttonText);
        this.type = type;
        this.pureName = pureName;
        this.screenText = screenText;
    }

    public String toString() {
        return "{type: " + this.type + ", pureName: " + this.pureName + ", button:" + this.getText() + ", screenText: " + this.screenText + "}";
    }

    public boolean isOperator() {
        return this.type.equalsIgnoreCase("operator");
    }

    static Map<String, ButtonHolder> getAll() {
        Map<String, ButtonHolder> map = new HashMap<String, ButtonHolder>();
        for (int i = 0; i <= 9; i++) {
            map.put("" + i, new ButtonHolder("numeric", "" + i, "" + i, "" + i));
        }
        map.put("PI" , new ButtonHolder("numeric", "PI" , "\u03c0" ,""+ Math.PI));
        map.put("e" , new ButtonHolder("numeric", "e" , "e" ,""+ Math.E));
        map.put("rand" , new ButtonHolder("numeric", "rand" , "rand" ,""+ Math.random()*100));
        map.put("hypot" , new ButtonHolder("operator", "hypot" , "\u221A(x\u00B2+y\u00B2)" ,"hypot"));
        map.put("floor" , new ButtonHolder("single_operator", "floor" , "└X┘" ,"└X┘"));
        map.put("ceil" , new ButtonHolder("single_operator", "ceil" , "┌X┐" ,"┌X┐"));
        map.put("add", new ButtonHolder("operator", "add", "+", "+"));
        map.put("sub", new ButtonHolder("operator", "subtract", "\u02D7", "\u02D7"));
        map.put("mul", new ButtonHolder("operator", "multiply", "\u00D7", "\u00D7"));
        map.put("div", new ButtonHolder("operator", "divide", "\u00F7", "\u00F7"));
        map.put("pow", new ButtonHolder("operator", "pow", "pow", "pow"));
        map.put("max", new ButtonHolder("operator", "max", "max", "max"));
        map.put("min", new ButtonHolder("operator", "min", "min", "min"));
        map.put("mod", new ButtonHolder("operator", "mod", "mod", "mod"));
        map.put("equal", new ButtonHolder("answer", "equal", "=", "="));
        map.put("point", new ButtonHolder("number_modifier", "point", ".", "."));
        map.put("delete", new ButtonHolder("command", "delete", "DE", ""));
        map.put("clear", new ButtonHolder("command", "clear", "C", ""));
        map.put("exit", new ButtonHolder("command", "exit", "EXIT", ""));
        map.put("percent", new ButtonHolder("single_operator", "percent", "%", "%"));
        map.put("one_by_n", new ButtonHolder("single_operator", "one_by_n", "1/n", "1/n"));
        map.put("square", new ButtonHolder("single_operator", "square", "x\u00B2", "x\u00B2"));
        map.put("cube", new ButtonHolder("single_operator", "cube", "x\u00B3", "x\u00B3"));
        map.put("sqrt", new ButtonHolder("single_operator", "square_root", "\u221A", "\u221A"));
        map.put("cbrt", new ButtonHolder("single_operator", "cube_root", "\u00B3\u221A", "\u00B3\u221A"));
        map.put("log1p", new ButtonHolder("single_operator", "log1p", "log(a+1)", "log1p"));
        map.put("expm1", new ButtonHolder("single_operator", "expm1", "e^x-1", "expm1"));
        map.put("scalb", new ButtonHolder("operator", "scalb", "x*(2^y)", "scalb"));
        map.put("oppo", new ButtonHolder("single_operator", "oppo", "+/-", "-"));
        String[] strings = {"sin", "cos", "tan", "asin", "acos", "atan", "sinh", "cosh", "tanh", "ln", "log","exp",
        		"abs","toDeg","toRad","round","signum"};
        
        for (String text : strings) {
            map.put(text, new ButtonHolder("single_operator", text, text, text));
        }
        return map;
    }

    static ArrayList<String> getMapKeysByType(Map<String, ButtonHolder> buttonHolderMap, String type) {
        ArrayList<String> keyList = new ArrayList<>();
        for (String mapKey : buttonHolderMap.keySet()) {
            ButtonHolder buttonHolder = buttonHolderMap.get(mapKey);
            if (buttonHolder.type.equalsIgnoreCase(type)) {
                keyList.add(mapKey);
            }
        }
        return keyList;
    }

    static ArrayList<String> getScreenTextListByType(Map<String, ButtonHolder> buttonHolderMap, String type){
        ArrayList<String> textList = new ArrayList<>();
        for (String mapKey : buttonHolderMap.keySet()) {
            ButtonHolder buttonHolder = buttonHolderMap.get(mapKey);
            if (buttonHolder.type.equalsIgnoreCase(type)) {
                textList.add(buttonHolder.screenText);
            }
        }
        return textList;
    }
}
