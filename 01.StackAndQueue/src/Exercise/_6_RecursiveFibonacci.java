package Exercise;

import java.util.Scanner;

public class _6_RecursiveFibonacci {
    //Масив за съхранение на вече изчислени резултати (мемоизация)
    private static long[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        memo = new long[n + 1];
        System.out.println(getFibonacci(n));

    }

    private static long getFibonacci(int n) {
        //Базови случай на рекурсията
        if (n==0){
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        //Проверка дали резултатът вече е изчислен и съхранен
        if (memo[n] != 0) {
            return memo[n];
        }
        //Рекурсивно изчисление и съхранеие на резултата
        memo[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
        return memo[n];
    }
}
