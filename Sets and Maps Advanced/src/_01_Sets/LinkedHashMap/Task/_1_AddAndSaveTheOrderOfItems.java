package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _1_AddAndSaveTheOrderOfItems {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>(Arrays.asList("Red", "Green", "Blue"));
        set.forEach(color-> System.out.printf("%s ",color));
    }
}
