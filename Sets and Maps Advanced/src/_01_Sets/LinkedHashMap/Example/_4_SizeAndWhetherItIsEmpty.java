package _01_Sets.LinkedHashMap.Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class _4_SizeAndWhetherItIsEmpty {
    public static void main(String[] args) {
        Set<String>fruitSet=new LinkedHashSet<>();
        fruitSet.add("Apple");
        System.out.println(fruitSet.size());//връща число : размер на Set
        System.out.println(fruitSet.isEmpty());//връща true/false болева  провенлива указваща дали Set е празен или не
    }
}
