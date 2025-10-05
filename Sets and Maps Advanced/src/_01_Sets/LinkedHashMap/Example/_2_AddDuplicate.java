package _01_Sets.LinkedHashMap.Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class _2_AddDuplicate {
    public static void main(String[] args) {
        Set<String>fruitSet=new LinkedHashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Apple");//Дубликат
        System.out.println(fruitSet.size());//Изход 2
    }
}
