package week20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        isBalanced("{[()]}");
    }

    public static boolean isBalanced(String exp){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else if(ch==')'||ch==']'||ch=='}'){
                if(stack.isEmpty()){
                    return false;
                }else if(ch!=brackets.get(stack.pop())){
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }

    }
}
