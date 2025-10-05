package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _2_AddDuplicate {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>(Arrays.asList("One", "Two", "One"));
        set.forEach(element-> System.out.printf("%s ",element));
    }
}
