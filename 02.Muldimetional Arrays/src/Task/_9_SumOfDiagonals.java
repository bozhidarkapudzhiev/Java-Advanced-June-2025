package Task;

public class _9_SumOfDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;
        sumLeftDiagonal = calculateMainDiagonal(matrix, sumLeftDiagonal);
        sumRightDiagonal = calculateSecondaryDiagonal(matrix, sumRightDiagonal);
        System.out.printf("Сума на главния диагонал: %d%n", sumLeftDiagonal);
        System.out.printf("Сума на вторичния диагонал: %d%n ",sumRightDiagonal);
    }

    private static int calculateMainDiagonal(int[][] matrix, int sum) {
        for (int i = 0; i < matrix.length ; i++) {
            sum+=matrix[i][i];
        }
        return sum;
    }

    private static int calculateSecondaryDiagonal(int[][] matrix, int sum) {
        for (int i = 0; i < matrix.length; i++) {
           sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
}
