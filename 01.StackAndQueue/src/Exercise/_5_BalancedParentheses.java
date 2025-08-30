package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        boolean isBalanced = checkBalancedExpression(expression);

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean checkBalancedExpression(String expression) {
        ArrayDeque<Character> parentheses = new ArrayDeque<>();

        for (char current : expression.toCharArray()) {
            if (current == '(' || current == '[' || current == '{') {
                parentheses.push(current);
            } else if (current == ')' || current == ']' || current == '}') {

                if (parentheses.isEmpty()) {
                    return false;
                }

                char lastParentheses = parentheses.pop();

                if (lastParentheses == '(' && current != ')') {
                    return false;
                }
                if (lastParentheses == '[' && current != ']') {
                    return false;
                }
                if (lastParentheses == '{' && current != '}') {
                    return false;
                }
            }
        }
        return parentheses.isEmpty();
    }
}