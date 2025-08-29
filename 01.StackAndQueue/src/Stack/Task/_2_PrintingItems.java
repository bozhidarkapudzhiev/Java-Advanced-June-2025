package Stack.Task;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _2_PrintingItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        int[] arraysInteger = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(arraysInteger).forEach(stack::push);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
