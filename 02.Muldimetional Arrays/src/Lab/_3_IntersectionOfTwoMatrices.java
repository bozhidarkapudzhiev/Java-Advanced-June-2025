package Lab;
import java.util.Scanner;

public class _3_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        String[][] matrixA = new String[rows][cols];
        String[][] matrixB = new String[rows][cols];
        completedMatrix(rows, scanner, matrixA);
        completedMatrix(rows, scanner, matrixB);
        String [][]result=new String[rows][cols];
        completeResultMatrix(matrixA, matrixB, result);
        printResultMatrix(result);
    }

    private static void printResultMatrix(String[][] result) {
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void completeResultMatrix(String[][] matrixA, String[][] matrixB, String[][] result) {
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                if (!matrixA[row][col].equals(matrixB[row][col])){
                    result[row][col]="*";
                }else {
                    result[row][col]= matrixA[row][col];
                }
            }
        }
    }

    private static void completedMatrix(int rows, Scanner scanner, String[][] matrixA) {
        for (int row = 0; row < rows; row++) {
            String[] currentArrays = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrixA[row].length; col++) {
                matrixA[row][col] = currentArrays[col];
            }

        }
    }
}
