package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _2_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arraysInteger = readerInput(scanner);
        int[][] matrix = new int[arraysInteger[0]][arraysInteger[1]];
        completeMatrixInt(matrix, scanner);
        insertElement(scanner, matrix);
    }

    private static void insertElement(Scanner scanner, int[][] matrix) {
        int searchElement = Integer.parseInt(scanner.nextLine());
        boolean isFound=false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                if (matrix[row][col]==searchElement){
                    System.out.println(row+" "+col);
                    isFound=true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }

    private static int completeMatrixInt(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            int[] currentLine = readerInput(scanner);
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = currentLine[col];
            }
        }
        return matrix.length;

    }

    public static int[] readerInput(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
