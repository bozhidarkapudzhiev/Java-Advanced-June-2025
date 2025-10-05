package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _6_IsTheSetEmpty {
    public static void main(String[] args) {
        Set<String> fruitSet=new HashSet<>();
        System.out.println(fruitSet.isEmpty());//true
        fruitSet.add("Apple");
        System.out.println(fruitSet.isEmpty());//false
    }
}
