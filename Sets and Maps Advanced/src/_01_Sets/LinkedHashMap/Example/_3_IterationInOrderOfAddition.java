package _01_Sets.LinkedHashMap.Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class _3_IterationInOrderOfAddition {
    public static void main(String[] args) {
        Set<String>fruitSet=new LinkedHashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Grape");
        for (String fruit : fruitSet) {
            System.out.println(fruit);//Извежда : Apple, Banana, Grape , всяко на нов ред
        }
    }
}
