package _01_Sets.LinkedHashMap.Task;

import java.util.*;

public class _10_CheckTheOrderAfterAddingCollection {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>(Arrays.asList("First"));
        List<String>list=new ArrayList<>(Arrays.asList("Second","Third"));
        set.addAll(list);
        System.out.println(String.valueOf(set)
                .replaceAll("\\[","")
                .replaceAll("\\]",""));
    }
}
