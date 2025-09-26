package String;
import java.util.*;

class ValidParentheses{
    public static boolean isValidParentheses(String str){
        Stack<Character> stack = new Stack<>();
        
        for(char c : str.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
            stack.push(c);
            }
            else if( c == '}' || c == ']' || c == ')'){
                if(stack.isEmpty()) return false;
                 
                char top = stack.peek();
                
                if(!((c == '}' && top == '{')||
                     (c == ']' && top == '[')||
                     (c == ')' && top == '('))){
                        return false;

                     }

                     stack.pop();

            }
        }
        return stack.isEmpty();
    }
    public static void main (String args[]){
        String str = "{[()]}";
        System.out.println(isValidParentheses(str));
    }
}