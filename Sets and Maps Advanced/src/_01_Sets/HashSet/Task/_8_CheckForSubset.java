package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _8_CheckForSubset {
    public static void main(String[] args) {
        // Set A: {1, 2, 3, 4},
        // Set B: {1, 4}	true
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 4));
        boolean contains = setA.containsAll(setB);
        System.out.println(contains);
    }
}
