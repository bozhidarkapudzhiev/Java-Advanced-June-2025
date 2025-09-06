package Task;

public class _10_PrintingElementsZigZagPattern {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.printf("%d ", matrix[row][col]);
                }
            } else {
                for (int col = matrix[row].length - 1; col >= 0; col--) {
                    System.out.printf("%d ", matrix[row][col]);
                }
            }
            System.out.println();
        }

    }
}

