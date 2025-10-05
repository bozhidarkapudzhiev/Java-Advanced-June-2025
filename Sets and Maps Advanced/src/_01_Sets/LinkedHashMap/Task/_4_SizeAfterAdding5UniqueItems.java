package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _4_SizeAfterAdding5UniqueItems {
    public static void main(String[] args) {
        Set<String>sets=new LinkedHashSet<>(Arrays.asList( "a", "b", "c", "d", "e"));
        System.out.print(sets.size());
    }
}
