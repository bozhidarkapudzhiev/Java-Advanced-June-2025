package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _1_AddedElements {
    public static void main(String[] args) {
        Set<String>fruitSet=new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.forEach(System.out::println);//Изход Apple, Banana (редът може да варира)
    }
}
