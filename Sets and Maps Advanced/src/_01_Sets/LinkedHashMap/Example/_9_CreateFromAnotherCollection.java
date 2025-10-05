package _01_Sets.LinkedHashMap.Example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _9_CreateFromAnotherCollection {
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("Apple","Banana","Apple");
        Set<String>uniqueFruit=new LinkedHashSet<>(fruits);
        uniqueFruit.forEach(System.out::println);
    }
}
