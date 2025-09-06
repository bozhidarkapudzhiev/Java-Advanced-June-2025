package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _5_MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = readerInputInt(scanner);
        int[][] matrix = new int[coordinates[0]][coordinates[1]];
        completeMatrixInt(matrix, scanner);
        int[][] resultMatrix = new int[2][2];
        int sum = insertGreaterElement(matrix, resultMatrix);
        printResultMatrix(resultMatrix, sum);


    }

    private static int insertGreaterElement(int[][] matrix,  int[][] resultMatrix) {
        int sum=0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum =
                        matrix[row][col] +
                                matrix[row + 1][col] +
                                matrix[row][col + 1] +
                                matrix[row + 1][col + 1];
                if (sum < currentSum) {
                    sum = currentSum;
                    resultMatrix[0][0] = matrix[row][col];
                    resultMatrix[0][1] = matrix[row][col + 1];
                    resultMatrix[1][0] = matrix[row + 1][col];
                    resultMatrix[1][1] = matrix[row + 1][col + 1];
                }
            }
        }
        return sum;
    }

    private static void printResultMatrix(int[][] resultMatrix, int sum) {
        for (int row = 0; row < resultMatrix.length; row++) {
            for (int col = 0; col < resultMatrix[row].length; col++) {
                System.out.print(resultMatrix[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
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
        return Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}
