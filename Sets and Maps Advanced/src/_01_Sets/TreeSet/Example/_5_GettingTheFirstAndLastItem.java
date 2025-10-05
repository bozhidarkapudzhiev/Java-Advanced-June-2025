package _01_Sets.TreeSet.Example;

import java.util.TreeSet;

public class _5_GettingTheFirstAndLastItem {
    public static void main(String[] args) {
        TreeSet<Integer>numbers=new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        System.out.println(numbers.first());//Получаваме първия елемент в Set-а = 2
        System.out.println(numbers.last());//Получаваме последния елемент в Set-а = 8
    }
}
