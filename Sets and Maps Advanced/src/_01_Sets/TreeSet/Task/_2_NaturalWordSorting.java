package _01_Sets.TreeSet.Task;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _2_NaturalWordSorting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]wordSetArrays=scanner.nextLine().split(",");
        Set<String> wordSet = new TreeSet<>(Arrays.asList(wordSetArrays));
        System.out.println(String.join(", ",wordSet));
    }
}
