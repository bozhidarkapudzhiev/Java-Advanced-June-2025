package Task;

public class _8_CountingEven_OddNumbers {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int even=0;
        int odd=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.printf("Четни числа: %d%n",even);
        System.out.printf("Нечетни числа: %d%n",odd);

    }
}
