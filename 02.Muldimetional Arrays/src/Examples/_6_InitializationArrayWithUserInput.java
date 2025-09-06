package Examples;

import java.util.Scanner;

public class _6_InitializationArrayWithUserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете брой редове: ");
        int rows=Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете брой колони: ");
        int cols=Integer.parseInt(scanner.nextLine());
        int [][]matrix=new  int [rows][cols];

        System.out.println("Въведтете елементите на матрицата: ");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("matrix["+row+"]["+col+"]: ");
                matrix[row][col]=scanner.nextInt();
            }
        }

        System.out.println("Въведената матрица: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
