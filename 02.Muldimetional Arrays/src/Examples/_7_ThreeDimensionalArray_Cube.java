package Examples;

public class _7_ThreeDimensionalArray_Cube {
    public static void main(String[] args) {
        int [][][]cube=new int[2][2][2];
        int value=1;
        for (int first = 0; first < 2; first++) {
            for (int second = 0; second < 2; second++) {
                for (int three = 0; three < 2; three++) {
                    cube[first][second][three]=value++;
                }
            }
        }
        System.out.println("Тримерен масив: ");
        for (int first = 0; first < 2; first++) {
            for (int second = 0; second < 2; second++) {
                for (int three = 0; three < 2; three++) {
                    System.out.print(cube[first][second][three]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
