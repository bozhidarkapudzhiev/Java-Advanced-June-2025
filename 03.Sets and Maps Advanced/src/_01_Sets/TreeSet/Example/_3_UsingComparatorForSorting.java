package _01_Sets.TreeSet.Example;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class _3_UsingComparatorForSorting {
    public static void main(String[] args) {
        Set<Integer>numbers=new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.forEach(number->System.out.print(number+" ")); //Изход :8, 5, 2
    }
}
