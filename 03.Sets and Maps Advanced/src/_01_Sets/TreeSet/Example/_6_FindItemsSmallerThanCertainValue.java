package _01_Sets.TreeSet.Example;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _6_FindItemsSmallerThanCertainValue {
    public static void main(String[] args) {
        TreeSet<Integer>numbers=new TreeSet<>(Arrays.asList(1,3,5,7,9));
        Set<Integer>headSet=numbers.headSet(5);
        System.out.println(headSet.toString().replaceAll("\\[","").replaceAll("\\]",""));
    }
}
