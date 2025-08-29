package Stack.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _3_CheckingBalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        isBalanced(expression);
    }

    private static boolean isBalanced(String expression) {
        ArrayDeque<Character> balancedCheck = new ArrayDeque<>();
        for (char curr : expression.toCharArray()) {
            if (curr == '(' || curr == '{' || curr == '[') {
                balancedCheck.push(curr);
            } else {
                char lastElement = balancedCheck.pop();
                if (curr == ')' && lastElement != '(') {
                    break;
                } else if (curr == '}' && lastElement != '{') {
                    break;
                } else if (curr == ']' && lastElement != '[') {
                    break;
                }
            }
        }
        if (!balancedCheck.isEmpty()) {
            System.out.println("NO");
            return false;
        }
        System.out.println("YES");
        return true;
    }
}
