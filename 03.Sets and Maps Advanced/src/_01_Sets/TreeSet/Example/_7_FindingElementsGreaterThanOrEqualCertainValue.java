package _01_Sets.TreeSet.Example;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _7_FindingElementsGreaterThanOrEqualCertainValue {
    public static void main(String[] args) {
        TreeSet<Integer>numbers=new TreeSet<>(Arrays.asList(1,3,5,7,9));
        Set<Integer>tailSet=numbers.tailSet(5);
        System.out.println(tailSet.toString().replaceAll("\\[","").replaceAll("\\]",""));
    }
}
