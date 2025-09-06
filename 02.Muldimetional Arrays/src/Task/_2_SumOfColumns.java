package Task;

public class _2_SumOfColumns {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] rotation = rotationMultiplyArrays(matrix);
        printResult(rotation);
    }

    private static void printResult(int[][] rotation) {
        for (int row = 0; row < rotation.length; row++) {
            int  sum=0;
            for (int col = 0; col < rotation[row].length; col++) {
                sum+= rotation[row][col];
            }
            System.out.printf("Сумата от %d: %d%n",row,sum);
        }
    }

    private static int[][] rotationMultiplyArrays(int[][] matrix) {
        int[][] rotation = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                rotation[col][row] = matrix[row][col];
            }
        }
        return rotation;
    }
}
