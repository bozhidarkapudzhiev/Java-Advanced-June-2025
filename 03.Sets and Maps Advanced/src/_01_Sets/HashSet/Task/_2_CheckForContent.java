package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _2_CheckForContent {
    public static void main(String[] args) {
        //{Apple, Banana, Orange}
        Scanner scanner=new Scanner(System.in);
        Set<String>fruitSet=new HashSet<>(Arrays.stream(scanner.nextLine().split(", ")).toList());
        String scannerFruit=scanner.nextLine();
        boolean containsFruit=fruitSet.contains(scannerFruit);
        System.out.println(containsFruit);
    }
}
