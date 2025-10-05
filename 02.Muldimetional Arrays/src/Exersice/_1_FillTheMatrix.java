package Exersice;

import java.util.Scanner;

public class _1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] coordinate = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(coordinate[0]);
        int cols = Integer.parseInt(coordinate[0]);
        int[][]matrix=new int[rows][cols];
        String pattern=coordinate[1];
        int counter=1;
        if ("A".equals(pattern)){
            patterA(matrix, counter);
        } else if ("B".equals(pattern)) {
            patternB(matrix, counter);
        }
        printMatrix(matrix);

    }

    private static void patternB(int[][] matrix, int counter) {
        for (int col = 0; col < matrix[0].length; col++) {
            if (col%2!=0){
                for (int row = matrix.length-1; row >=0 ; row--) {
                    matrix[row][col]= counter++;
                }
            }else{
                for (int row = 0; row < matrix.length ; row++) {
                    matrix[row][col]= counter++;
                }
            }
        }
    }

    private static void patterA(int[][] matrix, int counter) {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length ; row++) {
                matrix[row][col]= counter++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
