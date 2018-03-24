import java.util.Arrays;
import java.util.Date;

class Engine {
    String computeSciFun(String funcName, String input) {
        double inputValue = Double.parseDouble(input);

        if (funcName.equalsIgnoreCase("square")) {
            return "" + (inputValue * inputValue);

        } else if (funcName.equalsIgnoreCase("cube")) {
            return "" + (inputValue * inputValue * inputValue);

        } else if (funcName.equalsIgnoreCase("square_root")) {
            return "" + (Math.sqrt(inputValue));

        } else if (funcName.equalsIgnoreCase("one_by_n")) {
            return "" + ((double) 1 / inputValue);

        }else if(funcName.equalsIgnoreCase("ln")){
            return ""+Math.log(inputValue);

        } else if(funcName.equalsIgnoreCase("log")){
            return ""+Math.log10(inputValue);

        }else if (Arrays.asList("sin", "cos", "tan","asin", "acos", "atan", "sinh", "cosh", "tanh").contains(funcName)) {
            return "" + this.calculateTrigonometry(funcName, inputValue);
        }
        else if(funcName.equalsIgnoreCase("exp")){
            return ""+Math.exp(inputValue);

        }else if(funcName.equalsIgnoreCase("cube_root")){
            return ""+Math.cbrt(inputValue);
        }
        else if (funcName.equalsIgnoreCase("percent")) {
            return   "" + ((double)  inputValue/100);}
               return "Not implemented yet";
    }

    private double calculateTrigonometry(String functionName, double input) {
        double radianInput = Math.toRadians(input);
        if (functionName.equalsIgnoreCase("sin")) {
            return Math.sin(radianInput);
        } else if (functionName.equalsIgnoreCase("cos")) {
            return Math.cos(radianInput);
        } else if (functionName.equalsIgnoreCase("tan")) {
            return Math.tan(radianInput);
        }
          else if (functionName.equalsIgnoreCase("asin")) {
            return Math.asin(radianInput);
        } else if (functionName.equalsIgnoreCase("acos")) {
            return Math.acos(radianInput);
        } else if (functionName.equalsIgnoreCase("atan")) {
            return Math.atan(radianInput);
        } else if (functionName.equalsIgnoreCase("sinh")) {
            return Math.sinh(radianInput);
        } else if (functionName.equalsIgnoreCase("cosh")) {
            return Math.cosh(radianInput);
        } else if (functionName.equalsIgnoreCase("tanh")) {
            return Math.tanh(radianInput);
         }
        
        return input;
    }

    String compute(String operand1, String operand2, String operator){
        try {
            double parsedOperand1 = Double.parseDouble(operand1);
            double parsedOperand2 = Double.parseDouble(operand2);
            if (operator.equalsIgnoreCase("+")) {
                return ""+(parsedOperand1 + parsedOperand2);

            } else if (operator.equalsIgnoreCase("\u00D7")) {
                return ""+(parsedOperand1 * parsedOperand2);

            } else if (operator.equalsIgnoreCase("\u02D7")) {
                return ""+(parsedOperand1 - parsedOperand2);

            } else if (operator.equalsIgnoreCase("mod")) {
                return ""+(parsedOperand1 % parsedOperand2);

            }else if(operator.equalsIgnoreCase("\u00F7")){
                return ""+(parsedOperand1 / parsedOperand2);

            }
            else if(operator.equalsIgnoreCase("pow")){
                return ""+Math.pow(parsedOperand1 ,parsedOperand2);
            }
        }catch (Exception e){
            return "ERROR";
        }
        return "FAILED";
    }
}
