package ChapterOne.Three;

import java.util.Arrays;
import java.util.Stack;

public class ChapterOnePointThree {
    
    
    public static void main(String[] args) {
        
        // PAGE 129
        
        String transaction = "(1+((2+3)*(4*5)))";   // the result should be = 101.0
        int len = transaction.length();
    
        Stack <String> ops = new Stack<>();
        Stack <Double> vals = new Stack<>();
        
        System.out.println("transaction = " + transaction);
        
        for (int i = 0; i < len; i++) {
            String currentString = Character.toString(transaction.charAt(i));
            if (currentString.equals(("(")));
            else if(currentString.equals("+")) ops.push(currentString);
            else if(currentString.equals("-")) ops.push(currentString);
            else if(currentString.equals("*")) ops.push(currentString);
            else if(currentString.equals("/")) ops.push(currentString);
            else if(currentString.equals("sqrt")) ops.push(currentString);
            
            // if the string is ")" use pop and make calculation then push to value
            else if(currentString.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if(op.equals("-")) v = vals.pop() - v;
                else if(op.equals("*")) v = vals.pop() * v;
                else if(op.equals("/")) v = vals.pop() / v;
                else if(op.equals("sqrt")) v =  Math.sqrt(v);
                
                vals.push(v);
            }
            
            // double values...
            else vals.push(Double.parseDouble(currentString));
        }
        System.out.println("result = " + vals.pop());
        
        // PAGE 133
        FixedCapacityStackOfStrings fixedStack = new FixedCapacityStackOfStrings(100);
        
        String stackString = "to be - to be or - not be - to be";
        String[] inputString = stackString.split(" ");
        
        for(String currentString : inputString){
            if (!"-".equals(currentString)) {
                fixedStack.push(currentString);
            }
            else if ("-".equals(currentString)) {
                fixedStack.pop();
            }
        }
        System.out.println(fixedStack.size() + "left on stack");
    }
}
