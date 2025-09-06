package Task;

public class _1_SumOfLines {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3},
                {4,5,6}
        };

        for (int row = 0; row < matrix.length; row++) {
            int currentSum=0;
            for (int col = 0; col < matrix[row].length; col++) {
                currentSum+=matrix[row][col];
            }
            System.out.printf("Сума на ред %d: %d%n",row,currentSum);
        }
    }
}
