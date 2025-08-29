package Stack.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _7_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> matchingBrackets = new ArrayDeque<>();
        String expression = scanner.nextLine();
        for (char ch : expression.toCharArray()) {
            if (isMatchingBrackets(ch, matchingBrackets)) break;
        }

        IsEmptyArrayDeque(matchingBrackets);

    }

    private static void IsEmptyArrayDeque(ArrayDeque<Character> matchingBrackets) {
        if (!matchingBrackets.isEmpty()) {
            StringBuilder message = new StringBuilder();
            message.append("Error: Missing ");
            char lastElement = matchingBrackets.pop();
            if (lastElement == '(') {
                message.append("')'");
            } else if (lastElement=='[') {
                message.append("']'");
            }else {
                message.append("'}'");
            }
            System.out.println(message);
        } else {
            System.out.println("OK");
        }
    }

    private static boolean isMatchingBrackets(char ch, ArrayDeque<Character> matchingBrackets) {
        if (ch == '(' || ch == '[' || ch == '{') {
            matchingBrackets.push(ch);
        } else if (ch == ')' || ch == ']' || ch == '}') {
            char last = matchingBrackets.pop();
            if (ch == ')' && last != '(') {
                return true;
            } else if (ch == ']' && last != '[') {
                return true;
            } else if (ch == '}' && last != '{') {
                return true;
            }

        }
        return false;
    }
}
