package Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        completedMatrix(matrix, scanner);
        int sumRightDiagonal = 0;
        int sumLeftDiagonal = 0;
        sumLeftDiagonal = getSumLeftDiagonal(matrix, sumLeftDiagonal);
        sumRightDiagonal = getSumRightDiagonal(matrix, sumRightDiagonal);
        System.out.println(Math.abs(sumLeftDiagonal - sumRightDiagonal));
    }

    private static int getSumRightDiagonal(int[][] matrix, int sumRightDiagonal) {
        int col = 0;
        for (int row = matrix[0].length - 1; row >= 0; row--) {
            sumRightDiagonal += matrix[row][col];
            col++;
        }
        return sumRightDiagonal;
    }

    private static int getSumLeftDiagonal(int[][] matrix, int sumLeftDiagonal) {
        for (int row = 0; row < matrix.length; row++) {
            sumLeftDiagonal += matrix[row][row];
        }
        return sumLeftDiagonal;
    }

    private static void completedMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            int[] current = readerInputInt(scanner);
            for (int col = 0; col < current.length; col++) {
                matrix[row][col] = current[col];
            }

        }
    }

    private static int[] readerInputInt(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
