package _01_Sets.LinkedHashMap.Example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _10_DifferenceOfTwoSets {
    public static void main(String[] args) {
        Set<Integer>set1=new LinkedHashSet<>(Arrays.asList(1,2,3));
        Set<Integer>set2=new LinkedHashSet<>(Arrays.asList(2,3,4));
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
