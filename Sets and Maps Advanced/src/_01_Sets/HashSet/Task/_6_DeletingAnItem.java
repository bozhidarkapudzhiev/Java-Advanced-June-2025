package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _6_DeletingAnItem {
    public static void main(String[] args) {
        Set<String>sets=new HashSet<>(Arrays.asList("Pen", "Pencil", "Eraser"));
        sets.remove("Pencil");
        sets.forEach(System.out::println);
    }
}
