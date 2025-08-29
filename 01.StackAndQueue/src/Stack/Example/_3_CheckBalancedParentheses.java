package Stack.Example;

import java.util.ArrayDeque;
import java.util.Deque;

public class _3_CheckBalancedParentheses {
    public static void main(String[] args) {
        System.out.println("({[]}) is balanced: " + isBalanced("({[]})"));
        System.out.println("({[]}) is balanced: " + isBalanced("({]})"));

    }

    private static boolean isBalanced(String expression) {
        Deque<Character> stack=new ArrayDeque<>();
        for (char ch:expression.toCharArray()){
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                char lastElement=stack.pop();
                if (ch==')' && lastElement!='('){
                    return false;
                }else if (ch=='}' && lastElement!='{'){
                    return false;
                } else if (ch==']'&& lastElement!='[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
