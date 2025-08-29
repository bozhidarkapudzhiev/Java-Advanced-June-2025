package Stack.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_DecimalToBinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        if (n!=0){
            convertNumberToBinary(n, stack);
            printResult(stack);
        }else {
            System.out.println(0);
        }

    }

    private static void printResult(ArrayDeque<Integer> stack) {
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    private static void convertNumberToBinary(int n, ArrayDeque<Integer> stack) {
        while (n > 0) {
              if (n %2==0){
                  stack.push(0);
              }else {
                  stack.push(1);
              }
              n /=2;
        }
    }
}
