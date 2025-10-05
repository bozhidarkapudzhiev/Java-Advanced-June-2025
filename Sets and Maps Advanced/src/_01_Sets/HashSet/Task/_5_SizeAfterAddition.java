package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _5_SizeAfterAddition {
    public static void main(String[] args) {
        Set<String>sets=new HashSet<>(Arrays.asList("A","B"));
        sets.add("B");
        System.out.println(sets.size());
    }
}
