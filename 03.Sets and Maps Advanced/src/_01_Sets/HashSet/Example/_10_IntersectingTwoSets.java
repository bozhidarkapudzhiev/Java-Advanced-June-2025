package _01_Sets.HashSet.Example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _10_IntersectingTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer>set2=new HashSet<>(Arrays.asList(3,4,5));
        set1.retainAll(set2);
        System.out.println(set1);//Изход: [3]
    }
}
