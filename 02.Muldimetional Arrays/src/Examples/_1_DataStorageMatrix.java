package Examples;

public class _1_DataStorageMatrix {
    public static void main(String[] args) {
        int[][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int firstRowFirstCol=matrix[0][0];
        int threeRowThreeCol=matrix[2][2];
        System.out.println(firstRowFirstCol);//1
        System.out.println(threeRowThreeCol);//9
    }
}
