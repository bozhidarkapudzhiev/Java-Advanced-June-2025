package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _6_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        completeMatrix(matrix, scanner);
        printLeftDiagonal(matrix);
        printRightDiagonal(matrix);
    }

    private static void printRightDiagonal(int[][] matrix) {
        int col=0;
        for (int row = matrix.length-1; row>=0 ; row--) {
            System.out.print(matrix[row][col]+" ");
            col++;
        }
        System.out.println();
    }

    private static void printLeftDiagonal(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][row]+" ");
        }
        System.out.println();
    }

    private static void completeMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            int []arraysInteger= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]=arraysInteger[col];
            }
        }
    }
}
