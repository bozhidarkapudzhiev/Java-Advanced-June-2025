package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _7_CombiningTwoSets {
    public static void main(String[] args) {
        //Set A: {"A", "C"},
        //Set B: {"B", "A"}
        //[A, C, B]
        Set<String>set1=new LinkedHashSet<>(Arrays.asList("A", "C"));
        Set<String>set2=new LinkedHashSet<>(Arrays.asList("B", "A"));
        Set<String>difference=new LinkedHashSet<>(set1);
        difference.addAll(set2);
        System.out.println(
                String.valueOf(difference)
                        .replaceAll("\\[","")
                        .replaceAll("\\]",""));
    }
}
