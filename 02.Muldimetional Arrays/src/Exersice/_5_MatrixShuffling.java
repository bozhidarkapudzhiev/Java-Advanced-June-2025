package Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = readerInputInt(scanner);
        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];
        completeMatrixString(matrix, scanner);
        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String[] tokens = command.split("\\s+");

            if (tokens.length == 5 && tokens[0].equals("swap")) {
                try {
                    int row1 = Integer.parseInt(tokens[1]);
                    int col1 = Integer.parseInt(tokens[2]);
                    int row2 = Integer.parseInt(tokens[3]);
                    int col2 = Integer.parseInt(tokens[4]);

                    if (isValid(row1,col1,rows,cols) && isValid(row2, col2, rows,cols)){
                        String temp =matrix[row1][col1];
                        matrix[row1][col1]=matrix[row2][col2];
                        matrix[row2][col2]=temp;
                        printResultMatrix(matrix);
                    }else {
                        printErrorMessage();
                    }
                }catch (NumberFormatException e){
                    printErrorMessage();
                }
            }else {
                printErrorMessage();
            }
            command=scanner.nextLine();
        }
    }

    private static void printErrorMessage() {
        System.out.println("Invalid input!");
    }

    private static boolean isValid(int row, int col, int rows, int cols) {
        return row>=0 &&row< rows && col>=0 && col<cols;
    }


    private static void printResultMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String col : row) {
                System.out.printf("%s ", col);
            }
            System.out.println();
        }
    }


    private static void completeMatrixString(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] currentLine = readerInputString(scanner);
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = currentLine[col];
            }
        }
    }

    private static String[] readerInputString(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }

    private static int[] readerInputInt(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
