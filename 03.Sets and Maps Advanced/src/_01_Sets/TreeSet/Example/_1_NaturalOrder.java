package _01_Sets.TreeSet.Example;

import java.util.Set;
import java.util.TreeSet;

public class _1_NaturalOrder {
    public static void main(String[] args) {
        Set<Integer>numbers= new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.forEach(n->System.out.print(n+" "));
    }
}
