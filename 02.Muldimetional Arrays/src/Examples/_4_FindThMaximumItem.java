package Examples;

public class _4_FindThMaximumItem {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,3},
                {4,50,6},
                {7,8,90}
        };
        int max=matrix[0][0];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col]>max){
                    max=matrix[row][col];
                }
            }
        }
        System.out.println("Максималният елемен е: "+max);
    }
}
