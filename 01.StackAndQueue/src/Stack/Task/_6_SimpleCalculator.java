package Stack.Task;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _6_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackString = new ArrayDeque<>();
        completeStack(scanner, stackString);
        int result = 0;
        calculateResult(stackString, result);
        System.out.println(stackString.poll());
    }

    private static void calculateResult(ArrayDeque<String> queueString, int result) {
        while (queueString.size() > 1) {

            int first = Integer.parseInt(queueString.pop());
            int second = Integer.parseInt(queueString.pop());
            String operand = queueString.pop();
            switch (operand) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    result = first / second;
                    break;
            }
            result = Math.abs(result);
            queueString.push(String.valueOf(result));

        }
    }

    private static void completeStack(Scanner scanner, ArrayDeque<String> stackString) {
        String[] arrString = scanner.nextLine().split("\\s+");
        for (int i=arrString.length-1;i>=0;i--){
            stackString.push(String.valueOf(arrString[i]));
        }
    }
}
