package _01_Sets.TreeSet.Task;

import java.util.Arrays;
import java.util.TreeSet;

public class _8_ReverseSort {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>(Arrays.asList(5,1,8,3));
        String result=String.valueOf(set.reversed()).replaceAll("\\[","").replaceAll("\\]","");
        System.out.println(result);
    }
}
