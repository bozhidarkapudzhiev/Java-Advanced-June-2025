package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _4_CheckForAnAvailableItem {
    public static void main(String[] args) {
        Set<String>fruitSet=new HashSet<>();
        fruitSet.add("Apple");
        boolean containsApple=fruitSet.contains("Apple");
        boolean containsBanana=fruitSet.contains("Banana");
        System.out.println(containsApple);//true
        System.out.println(containsBanana);//false
    }
}
