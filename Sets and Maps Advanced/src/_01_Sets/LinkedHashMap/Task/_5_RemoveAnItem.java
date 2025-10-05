package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _5_RemoveAnItem {
    public static void main(String[] args) {
        Set<Character>set=new LinkedHashSet<>(Arrays.asList('X', 'Y', 'Z'));
        set.remove('Y');
        System.out.println(set);
    }
}
