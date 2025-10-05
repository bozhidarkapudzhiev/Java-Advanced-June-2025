package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _4_Crossing {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50));
        set1.retainAll(set2);
        System.out.println(set1);

    }
}
