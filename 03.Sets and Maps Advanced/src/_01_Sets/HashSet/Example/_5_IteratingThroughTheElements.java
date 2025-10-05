package _01_Sets.HashSet.Example;

import java.util.HashSet;
import java.util.Set;

public class _5_IteratingThroughTheElements {
    public static void main(String[] args) {
        Set<String>fruitSet=new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        for (String fruit:fruitSet){
            System.out.println(fruit);//Извежда "Apple", след това "Banana" (или обратното)
        }
    }
}
