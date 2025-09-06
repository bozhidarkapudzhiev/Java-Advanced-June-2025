package Examples;

public class _5_MoldTransport {
    public static void main(String[] args) {
        int[][] originalMatrix={
                {1,2,3},
                {4,5,6}
        };

        int rows=originalMatrix.length;
        int cols=originalMatrix[0].length;
        int [][] transposedMatrix=new int [cols][rows];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposedMatrix[col][row]=originalMatrix[row][col];
            }
        }
        System.out.println("Транспортирана матрица: ");
        for (int row = 0; row < transposedMatrix.length; row++) {
            for (int col = 0; col < transposedMatrix[row].length; col++) {
                System.out.print(transposedMatrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
