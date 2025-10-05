package _01_Sets.TreeSet.Example;

import java.util.TreeSet;

public class _9_IterationInSortedOrder {
    public static void main(String[] args) {
        TreeSet<Integer>numbers=new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
