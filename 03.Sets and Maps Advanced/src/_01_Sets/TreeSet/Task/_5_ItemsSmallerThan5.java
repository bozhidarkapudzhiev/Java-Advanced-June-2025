package _01_Sets.TreeSet.Task;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _5_ItemsSmallerThan5 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> headSet = set.headSet(5);
        System.out.println(headSet.toString()
                .replaceAll("\\[","")
                .replaceAll("\\]",""));
    }
}
