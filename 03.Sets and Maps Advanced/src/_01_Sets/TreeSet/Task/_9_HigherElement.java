package _01_Sets.TreeSet.Task;

import java.util.Arrays;
import java.util.TreeSet;

public class _9_HigherElement {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>(Arrays.asList(1, 3, 5, 7));
        System.out.println(set.higher(4));
    }
}
