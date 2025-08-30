package Queue.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8_EliminationOfRepetitiveCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Character>input=new ArrayDeque<>();
        String expression=scanner.nextLine();
        checkDuplicateCharacter(expression, input);
        StringBuilder builder=new StringBuilder();
        printResult(input, builder);
        //aabbcdeeff	abcdef
        //abacaba	abacaba
    }

    private static void printResult(ArrayDeque<Character> input, StringBuilder builder) {
        while (!input.isEmpty()){
            builder.append(input.poll());
        }
        System.out.println(builder);
    }

    private static void checkDuplicateCharacter(String expression, ArrayDeque<Character> input) {
        for (char current: expression.toCharArray()){
            if (!input.isEmpty()){
                char lastElement= input.peekLast();
                if (current!= lastElement){
                    input.offer(current);
                }
            }else{
                input.offer(current);
            }
        }
    }
}
