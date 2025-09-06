package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _4_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arraysInteger = readerInputInt(scanner);
        int[][] matrix = new int[arraysInteger[0]][arraysInteger[1]];
        int sum = completeMatrixInt(matrix, scanner);
        printResult(matrix, sum);
    }

    private static void printResult(int[][] matrix, int sum) {
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }

    private static int completeMatrixInt(int[][] matrix, Scanner scanner) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            int[] currentLine = readerInputInt(scanner);
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = currentLine[col];
                sum += matrix[row][col];
            }
        }
        return sum;

    }

    private static int[] readerInputInt(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}