package Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] coordinate = readerCoordinates(scanner);
        int[] arraysInteger = readerCoordinates(scanner);
        addElementQueue(coordinate, queue, arraysInteger);
        removeElements(coordinate, queue);
        printResults(queue, coordinate);
    }

    private static int[] readerCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static void printResults(ArrayDeque<Integer> queue, int[] coordinate) {
        if (!queue.isEmpty()) {
            boolean isContains = queue.contains(coordinate[2]);
            if (isContains) {
                System.out.println(true);
            } else {
                insertMinValue(queue);
            }
        } else {
            System.out.println(0);
        }
    }

    private static void insertMinValue(ArrayDeque<Integer> queue) {
        int minValue = Integer.MAX_VALUE;
        for (int current:queue){
            if (current<minValue){
                minValue=current;
            }
        }
            System.out.println(minValue);
    }

    private static void removeElements(int[] coordinate, ArrayDeque<Integer> queue) {
        for (int i = 0; i < coordinate[1]; i++) {
            queue.poll();
        }
    }

    private static void addElementQueue(int[] coordinate, ArrayDeque<Integer> queue, int[] arraysInteger) {
        for (int i = 0; i < coordinate[0]; i++) {
            queue.offer(arraysInteger[i]);
        }
    }
}
