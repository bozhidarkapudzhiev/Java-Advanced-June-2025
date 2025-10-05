package _01_Sets.LinkedHashMap.Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class _5_RemovingElements {
    public static void main(String[] args) {
        Set<String>fruitSet=new LinkedHashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.remove("Apple");// remove() - изтрива подадения елемент в скобите.

    }
}
