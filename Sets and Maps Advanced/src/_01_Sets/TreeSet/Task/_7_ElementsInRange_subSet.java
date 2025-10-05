package _01_Sets.TreeSet.Task;

import java.util.Arrays;
import java.util.TreeSet;

public class _7_ElementsInRange_subSet {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>(Arrays.asList(1,3,5,7,9));
        String result=String.join(",",
                        String.valueOf(set.subSet(2, 8))
                                .replaceAll("\\[",""))
                                .replaceAll("\\]","");
        System.out.println(result);
    }
}
