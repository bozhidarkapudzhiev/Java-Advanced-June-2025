package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _9_ClearTheSet {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>(Arrays.asList("L","M"));
        set.clear();
        System.out.println(set);
    }

}
