package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String expression=scanner.nextLine();
        ArrayDeque<Integer>stackCharacter=new ArrayDeque<>();
        ArrayDeque<String>result=new ArrayDeque<>();
        insertExpresionBrackets(expression, stackCharacter, result);
        printExpression(result);
    }

    private static void printExpression(ArrayDeque<String> result) {
        while (!result.isEmpty()){
            System.out.println(result.poll());
        }
    }

    private static void insertExpresionBrackets(String expression, ArrayDeque<Integer> stackCharacter, ArrayDeque<String> result) {
        for (int i = 0; i < expression.length(); i++) {
            if ('(' == expression.charAt(i)){
                stackCharacter.push(i);
            }else if (')'== expression.charAt(i)){
                int lastOpenBracket= stackCharacter.pop();
                String currentExpression= expression.substring(lastOpenBracket,i+1);
                result.offer(currentExpression);
            }
        }
    }
}
