package Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _4_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = readerInputInt(scanner);
        int[][] matrix = new int[coordinates[0]][coordinates[1]];
        completeMatrixInt(matrix, scanner);
        int[][] matrixResult = new int[3][3];
        int sum= insertMaximalSum( matrix, matrixResult);
        printMaximalMatrix(sum,matrixResult);
    }

    private static void printMaximalMatrix(int sum, int[][] matrixResult) {
        System.out.printf( "Sum = %d%n", sum);
        for (int row = 0; row < matrixResult.length; row++) {
            for (int col = 0; col < matrixResult[row].length; col++) {
                System.out.printf("%d ", matrixResult[row][col]);
            }
            System.out.println();
        }
    }

    private static int  insertMaximalSum(int[][] matrix, int[][] matrixResult) {
        int sum=0;
        for (int row = 1; row < matrix.length-1; row++) {
            for (int col = 1; col < matrix[row].length-1; col++) {
                int currentSum= matrix[row-1][col-1]+ matrix[row-1][col]+ matrix[row-1][col+1]+
                               matrix[row][col-1]+ matrix[row][col]+ matrix[row][col+1]+
                               matrix[row+1][col-1]+ matrix[row+1][col]+ matrix[row+1][col+1];
                if (currentSum> sum){
                    sum =currentSum;
                    matrixResult[0][0]= matrix[row-1][col-1];
                    matrixResult[0][1]= matrix[row-1][col];
                    matrixResult[0][2]= matrix[row-1][col+1];

                    matrixResult[1][0]= matrix[row][col-1];
                    matrixResult[1][1]= matrix[row][col];
                    matrixResult[1][2]= matrix[row][col+1];

                    matrixResult[2][0]= matrix[row+1][col-1];
                    matrixResult[2][1]= matrix[row+1][col];
                    matrixResult[2][2]= matrix[row+1][col+1];
                }
            }
        }
        return sum;
    }

    private static int completeMatrixInt(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            int[] currentLine = readerInputInt(scanner);
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = currentLine[col];
            }
        }
        return matrix.length;

    }

    private static int[] readerInputInt(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
