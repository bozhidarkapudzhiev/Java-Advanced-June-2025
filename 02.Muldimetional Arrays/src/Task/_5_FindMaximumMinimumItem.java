package Task;
public class _5_FindMaximumMinimumItem {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20},
                {5, 30}
        };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //С обикновен for цикъл
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col]<min){
                    min=matrix[row][col];
                } else if (matrix[row][col]>max) {
                    max=matrix[row][col];
                }
            }
        }
        //Максимален елемент: 30
        //Минимален елемент: 5
        System.out.printf("Максимален елемент: %d%n", max);
        System.out.printf("Минимален елемент: %d%n", min);
    }
}
