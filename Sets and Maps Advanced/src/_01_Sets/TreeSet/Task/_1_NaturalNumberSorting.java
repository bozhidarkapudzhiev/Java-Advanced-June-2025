package _01_Sets.TreeSet.Task;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _1_NaturalNumberSorting {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>(Arrays.asList(5,1,8,3));

        System.out.println(String.valueOf(set)
                        .replaceAll("\\[","")
                        .replaceAll("\\]",""));
    }
}
