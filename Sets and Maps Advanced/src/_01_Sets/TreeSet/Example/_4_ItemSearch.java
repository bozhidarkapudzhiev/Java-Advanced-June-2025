package _01_Sets.TreeSet.Example;

import java.util.Set;
import java.util.TreeSet;

public class _4_ItemSearch {
    public static void main(String[] args) {
        Set<String>words=new TreeSet<>();
        words.add("Banana");
        words.add("Apple");
        boolean containsApple=words.contains("Apple");
        System.out.println(containsApple);
    }
}
