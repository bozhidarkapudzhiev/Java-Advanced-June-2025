package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _8_SetSize {
    public static void main(String[] args) {
        Set<String> fruitSet=new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        System.out.println(fruitSet.size());//Изход: 2
    }
}
