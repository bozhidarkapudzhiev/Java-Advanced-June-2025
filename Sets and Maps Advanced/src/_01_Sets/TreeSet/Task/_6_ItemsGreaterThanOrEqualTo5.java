package _01_Sets.TreeSet.Task;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class _6_ItemsGreaterThanOrEqualTo5 {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>(Arrays.asList(1,5,7,9));
        SortedSet<Integer> itemsGreaterThanOrEqualTo5=set.tailSet(5);
        System.out.println(itemsGreaterThanOrEqualTo5.toString()
                .replaceAll("\\[", "")
                .replaceAll("\\]", ""));
    }
}
