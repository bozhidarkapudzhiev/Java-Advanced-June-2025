package Examples;

public class _2_Uneven_Jagged_Arrays {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};
        System.out.println("Jagged масив: ");
        //Обхождане с обикновен for цикъл
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                System.out.print(jaggedArray[row][col]+" ");
            }
            System.out.println();
        }
        //Обхождане с разширен forEach цикъл
        for (int []row:jaggedArray){
            for(int currentEl:row){
                System.out.print(currentEl+" ");
            }
            System.out.println();
        }
    }
}
