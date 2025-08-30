package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackString = new ArrayDeque<>();
        String[] arrString = scanner.nextLine().split("\\s+");
        addElementInStack(arrString, stackString);
        calculateResult(stackString);
    }

    private static void calculateResult(ArrayDeque<String> stackString) {
        while (stackString.size() > 1) {
            int firstNum = Integer.parseInt(stackString.pop());
            String operand = stackString.pop();
            int secondNum = Integer.parseInt(stackString.pop());
            int result = 0;
            switch (operand) {
                case "+":
                    result = firstNum + secondNum;
                    stackString.push(String.valueOf(result));
                    break;
                case "-":
                    result = Math.abs(firstNum - secondNum);
                    stackString.push(String.valueOf(result));
                    break;
            }
        }
        System.out.println(stackString.pop());
    }

    private static void addElementInStack(String[] arrString, ArrayDeque<String> stackString) {
        for (int i = arrString.length - 1; i >= 0; i--) {
            stackString.push(arrString[i]);
        }
    }
}
