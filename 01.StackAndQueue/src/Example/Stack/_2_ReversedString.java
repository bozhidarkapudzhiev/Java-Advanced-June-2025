package Example.Stack;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.SortedMap;

public class _2_ReversedString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Character>stack=new ArrayDeque<>();
        String input=scanner.nextLine();
        for (char ch:input.toCharArray()){
            stack.push(ch);
        }
        StringBuilder reversed=new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        System.out.println("Original: "+input);
        System.out.println("Reversed: "+reversed);
    }
}
