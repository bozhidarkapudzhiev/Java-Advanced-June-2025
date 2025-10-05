package _01_Sets.LinkedHashMap.Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class _7_ClearTheSet {
    public static void main(String[] args) {
        Set<String>fruitSet=new LinkedHashSet<>();
        fruitSet.add("Apple");
        fruitSet.clear();//Изчиства елементите съдържащи се в Set- а
        System.out.println(fruitSet.size());//Изход: 0
    }

}
