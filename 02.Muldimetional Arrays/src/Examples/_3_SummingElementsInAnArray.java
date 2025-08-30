package Examples;

public class _3_SummingElementsInAnArray {
    public static void main(String[] args) {
        int[][]matrix={
                {1,2},
                {4,5},
                {6,7}
        };
        int sum=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum+=matrix[row][col];
            }
        }
        System.out.println("Сумата на всички елементи е: "+sum);
    }
}
