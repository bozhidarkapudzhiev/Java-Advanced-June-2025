package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _9_AddNull {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>(Arrays.asList("A"));
        set.add(null);
        set.forEach(System.out::println);
    }
}
