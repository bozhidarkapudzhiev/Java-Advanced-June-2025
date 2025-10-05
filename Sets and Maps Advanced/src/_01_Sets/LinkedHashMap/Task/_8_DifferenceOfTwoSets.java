package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _8_DifferenceOfTwoSets {
    public static void main(String[] args) {
        //Set A: {1, 2, 3, 4}
        //Set B: {2, 4}
        Set<Integer>setA=new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer>setB=new LinkedHashSet<>(Arrays.asList( 2, 4));
        setA.removeAll(setB);
        System.out.println(String.valueOf(setA).
                replaceAll("\\[","")
                .replaceAll("\\]",""));
    }
}
