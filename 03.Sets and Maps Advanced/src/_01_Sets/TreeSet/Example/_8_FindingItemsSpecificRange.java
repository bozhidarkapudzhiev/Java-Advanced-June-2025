package _01_Sets.TreeSet.Example;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _8_FindingItemsSpecificRange {
    public static void main(String[] args) {
        TreeSet<Integer>numbers=new TreeSet<>(Arrays.asList(1,3,5,7,9));
        Set<Integer>subSet=numbers.subSet(3,8);
        System.out.println(subSet.toString().replaceAll("\\[","").replaceAll("\\]",""));
    }
}
