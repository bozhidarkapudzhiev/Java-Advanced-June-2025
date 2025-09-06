package Task;

public class _7_MatrixAddition {
    public static void main(String[] args) {
        int [][] matrixA={
                {1,2},
                {3,4},
        };
        int [][] matrixB={
                {5,6},
                {7,8},
        };
        int [][] result=new int [matrixA.length][matrixA.length];
        boolean isEqualsLength= matrixA.length==matrixB.length;
        boolean isEqualsRowFirst=matrixA[0].length==matrixB[0].length;
        boolean isEqualsRowSecond=matrixA[1].length==matrixB[1].length;
        if (isEqualsLength && isEqualsRowFirst && isEqualsRowSecond){
            completeResultMatrix(result, matrixA, matrixB);
        }else {
            System.out.println("Matrix's is not equals.");
            return;
        }
        printResultMatrix(result);
    }

    private static void printResultMatrix(int[][] result) {
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.printf("%d ", result[row][col]);
            }
            System.out.println();
        }
    }

    private static void completeResultMatrix(int[][] result, int[][] matrixA, int[][] matrixB) {
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result.length; col++) {
                int currentMatrixA= matrixA[row][col];
                int currentMatrixB= matrixB[row][col];
                result[row][col]=currentMatrixA+currentMatrixB;
            }
        }
    }
}
