package Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[coordinates[0]][coordinates[1]];
        palindromesCompleted(matrix);
        printMatrixResult(matrix);


    }

    private static void printMatrixResult(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void palindromesCompleted(String[][] matrix) {
        char startCharacter = 'a';
        int characterNumeric = startCharacter;
        char secondCharacter = (char) characterNumeric;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                StringBuilder builder = new StringBuilder();
                //Append characters
                builder.append(startCharacter).append(secondCharacter).append(startCharacter);
                matrix[row][col] = builder.toString();
                characterNumeric++;
                secondCharacter = (char) characterNumeric;
            }
            characterNumeric = startCharacter+1;
            secondCharacter =(char) characterNumeric;
            startCharacter = (char) characterNumeric;
        }
    }
}
