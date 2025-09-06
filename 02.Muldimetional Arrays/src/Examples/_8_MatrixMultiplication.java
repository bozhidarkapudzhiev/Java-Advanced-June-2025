package Examples;

public class _8_MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2},
                {3, 4},
        };
        int[][] matrixB = {
                {5, 6},
                {7, 8},
        };
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j]=matrixA[i][k]*matrixB[k][j];
                }
            }
        }
        System.out.println("Резултат от умножението на матриците: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
