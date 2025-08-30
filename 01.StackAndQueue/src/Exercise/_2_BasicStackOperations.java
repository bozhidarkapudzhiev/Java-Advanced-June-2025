package Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stackInteger = new ArrayDeque<>();
        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arraysInteger = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        addElementStack(coordinates, stackInteger, arraysInteger);
        popElements(coordinates, stackInteger);
        if (stackInteger.contains(coordinates[2])) {
            System.out.println(true);
        } else {
            printMinValue(stackInteger);
        }
    }

    private static void printMinValue(ArrayDeque<Integer> stackInteger) {
        if (stackInteger.isEmpty()) {
            System.out.println(0);
            return;
        } else {
            int minValue = Integer.MAX_VALUE;
            for (int current : stackInteger) {
                if (current < minValue) {
                    minValue = current;
                }
            }
            System.out.println(minValue);
        }

    }

    private static void popElements(int[] coordinate, ArrayDeque<Integer> stackInteger) {
        int count = coordinate[1];
        for (int i = 0; i < count; i++) {
            stackInteger.pop();
        }
    }

    private static void addElementStack(int[] coordinates, ArrayDeque<Integer> stackInteger, int[] arraysInteger) {
        for (int i = 0; i < coordinates[0]; i++) {
            stackInteger.push(arraysInteger[i]);
        }
    }
}
