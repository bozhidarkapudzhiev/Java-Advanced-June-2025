package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _6_CheckForContentOf_Z_ {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>(Arrays.asList("X", "Y", "Z"));
        boolean checkContainsSet=set.contains("Z");
        System.out.println(checkContainsSet);

    }
}
