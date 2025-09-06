package Task;

public class _3_FindItem {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3},
                {4,5,6},
        };
        int findItem=5;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col]==findItem){
                    System.out.printf("Елементът %d е намерен на позиция: [%d][%d]%n", findItem,row,col);
                    return;
                }
            }
        }

    }
}
