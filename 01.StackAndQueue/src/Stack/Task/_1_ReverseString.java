package Stack.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        ArrayDeque<Character>stack=new ArrayDeque<>();
        for (char ch:input.toCharArray()){
            stack.push(ch);
        }
        StringBuilder reversedString=new StringBuilder();
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }
        System.out.println(reversedString.toString());
    }
}
