package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _3_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackInteger = new ArrayDeque<>();
        convertToBinary(n, stackInteger);
        printResult(stackInteger);
    }

    private static void convertToBinary(int n, ArrayDeque<Integer> stackInteger) {
        if (n==0){
            stackInteger.push(0);
            return;
        }
        while (n > 0) {
            if (n %2==0){
                stackInteger.push(0);
            }else {
                stackInteger.push(1);
            }
            n /=2;
        }
    }

    private static void printResult(ArrayDeque<Integer> stackInteger) {
        while (!stackInteger.isEmpty()){
            System.out.print(stackInteger.pop());
        }
        System.out.println();
    }
}
