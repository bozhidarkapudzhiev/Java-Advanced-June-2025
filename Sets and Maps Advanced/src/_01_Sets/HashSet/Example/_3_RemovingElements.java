package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _3_RemovingElements {
    public static void main(String[] args) {
        Set<String> fruitSet=new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        //removing element
        fruitSet.remove("Apple");
        fruitSet.forEach(System.out::println);
    }
}
