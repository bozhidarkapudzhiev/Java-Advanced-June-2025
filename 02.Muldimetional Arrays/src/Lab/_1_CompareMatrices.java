package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _1_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Completed Matrix
        int[] arraysInteger = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrixA = completedMatrix(arraysInteger, scanner);
        arraysInteger = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrixB = completedMatrix(arraysInteger, scanner);
        //2.Check for equals arrays
        boolean isEquals=equalsArrays(matrixA,matrixB);
        //3.Print Result
        printResult(isEquals);
    }

    private static void printResult(boolean isEquals) {
        if (isEquals) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean equalsArrays(int[][] matrixA, int[][] matrixB) {
        int matrixALength = matrixA.length;
        int matrixBLength = matrixB.length;
        int matrixAColLength = matrixA[0].length;
        int matrixBColLength = matrixB[0].length;
        boolean isEquals = matrixALength == matrixBLength && matrixAColLength == matrixBColLength;
        if (isEquals) {
            for (int row = 0; row < matrixA.length; row++) {
                for (int col = 0; col < matrixA[row].length; col++) {
                    if (matrixA[row][col] != matrixB[row][col]) {
                        return false;
                    }
                }
            }
        }else {
            return false;
        }
        return true;
    }

    private static int[][] completedMatrix(int[] arraysInteger, Scanner scanner) {
        int rows = arraysInteger[0];
        int cols = arraysInteger[1];
        int[][] matrixA = new int[rows][cols];
        for (int row = 0; row < matrixA.length; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < matrixA[row].length; col++) {
                matrixA[row][col] = currentRow[col];
            }
        }
        return matrixA;
    }
}
