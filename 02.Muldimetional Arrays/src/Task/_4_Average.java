package Task;

import java.util.Scanner;

public class _4_Average {
    public static void main(String[] args) {
        int [][]matrix={
                {1, 2, 3},
                {4, 5, 6}
        };
        double sumElement=0.0;
        int divisible=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sumElement+=matrix[row][col];
                divisible++;
            }
        }
        sumElement/=divisible;
        System.out.printf("Средната стойност е: %.1f%n",sumElement);
    }
}
