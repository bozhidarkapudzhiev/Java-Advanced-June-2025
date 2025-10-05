package _01_Sets.LinkedHashMap.Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class _6_Using_contains_method {
    public static void main(String[] args) {
        Set<String>fruitSet=new LinkedHashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        System.out.println(fruitSet.contains("Banana"));//Ако елемета се съдържа в Set-а ,връща  true , в противен случай  false
    }
}
