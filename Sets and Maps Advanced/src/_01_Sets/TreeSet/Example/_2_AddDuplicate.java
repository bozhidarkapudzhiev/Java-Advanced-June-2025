package _01_Sets.TreeSet.Example;

import java.util.Set;
import java.util.TreeSet;

public class _2_AddDuplicate {
    public static void main(String[] args) {
        Set<Integer>numbers=new TreeSet<>();
        numbers.add(5);
        numbers.add(5);//Дубликат
        System.out.println(numbers.size());
    }
}
