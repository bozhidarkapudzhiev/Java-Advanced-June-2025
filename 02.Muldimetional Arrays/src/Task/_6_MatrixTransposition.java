package Task;

public class _6_MatrixTransposition {
    public static void main(String[] args) {
        int [][] matrix={
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int [][] transportMatrix=new int[matrix.length-1][matrix.length];
        transportedMatrix(transportMatrix, matrix);
        printResult(transportMatrix);

    }

    private static void printResult(int[][] transportMatrix) {
        for (int row = 0; row < transportMatrix.length; row++) {
            for (int col = 0; col < transportMatrix[row].length; col++) {
                System.out.print(transportMatrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void transportedMatrix(int[][] transportMatrix, int[][] matrix) {
        for (int row = 0; row < transportMatrix.length; row++) {
            for (int col = 0; col < transportMatrix[row].length; col++) {
                transportMatrix[row][col]= matrix[col][row];

            }
        }
    }
}
