package Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _1_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stackInteger = new ArrayDeque<>();
        int[] arraysInteger = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.stream(arraysInteger).forEach(stackInteger::push);
        stackInteger.forEach(e->System.out.print(stackInteger.pop()+" "));

    }
}
