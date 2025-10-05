package _01_Sets.LinkedHashMap.Example;

import java.util.*;

public class _8_AddCollection {
    public static void main(String[] args) {
        Set<String>firstSet=new LinkedHashSet<>();
        firstSet.add("A");
        List<String>list= Arrays.asList("B","C");
        firstSet.addAll(list);
        firstSet.forEach(s-> System.out.printf("%s ",s));
    }
}
