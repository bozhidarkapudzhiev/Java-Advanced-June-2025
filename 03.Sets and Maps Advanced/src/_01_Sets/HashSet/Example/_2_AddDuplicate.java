package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _2_AddDuplicate {
    public static void main(String[] args) {
        Set<String>fruitSet=new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Apple");
        fruitSet.forEach(System.out::println);
        System.out.println(fruitSet.size());
    }
}
