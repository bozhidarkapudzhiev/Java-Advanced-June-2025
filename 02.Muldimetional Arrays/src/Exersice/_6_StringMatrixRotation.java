package Exersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _6_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotationLine = scanner.nextLine();
        int rotation = getRotationDegrees(rotationLine);
        List<String> words = new ArrayList<>();
        String line = scanner.nextLine();
        while (!"END".equals(line)) {
            words.add(line);
            line = scanner.nextLine();
        }
        rotationPrint(words, rotation);

    }

    private static void rotationPrint(List<String> words, int rotation) {
        int maxLength=findMaxLength(words);
        int rows=words.size();
        int cols=maxLength;
        char [][] matrix=new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String currentWord=words.get(row);
            for (int col = 0; col <cols ; col++) {
                if (col<currentWord.length()){
                    matrix[row][col]=currentWord.charAt(col);
                }else {
                    matrix[row][col]=' ';
                }
            }
        }
        switch (rotation){
            case 90:
                printRotation90(matrix);
                break;
            case 180:
                printRotation180(matrix);
                break;
            case 270:
                printRotation270(matrix);
                break;
            default:
                printOriginal(matrix);
                break;
        }
    }

    private static void printOriginal(char[][] matrix) {
        for (char[]row:matrix){
            for (char col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void printRotation270(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for (int col = cols-1; col >=0 ; col--) {
            for (int row = 0; row <rows ; row++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printRotation180(char[][] matrix) {
        int rows =matrix.length;
        int cols=matrix[0].length;
        for (int row = rows-1; row >=0 ; row--) {
            for (int col = cols-1; col >=0 ; col--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printRotation90(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for (int col = 0; col < cols; col++) {
            for (int row = rows-1; row >=0 ; row--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int findMaxLength(List<String> words) {
        int maxLength=0;
        for (String word:words){
            if (word.length()>maxLength){
                maxLength=word.length();
            }
        }
        return maxLength;
    }

    private static int getRotationDegrees(String rotationLine) {
        int start = rotationLine.indexOf('(') + 1;
        int end = rotationLine.indexOf(')');
        String degreesString = rotationLine.substring(start, end);
        int degrees = Integer.parseInt(degreesString);
        return degrees % 360;
    }
}