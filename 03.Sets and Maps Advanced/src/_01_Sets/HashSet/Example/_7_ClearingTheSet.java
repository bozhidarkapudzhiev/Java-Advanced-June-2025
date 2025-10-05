package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _7_ClearingTheSet {
    public static void main(String[] args) {
        Set<String>fruitSet=new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.clear();
        System.out.println(fruitSet.size());//Изход: 0
    }
}
