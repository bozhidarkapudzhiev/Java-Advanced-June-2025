package _01_Sets.TreeSet.Example;

import java.util.Arrays;
import java.util.TreeSet;

public class _10_RemovingElement {
    public static void main(String[] args) {
        TreeSet<Integer>numbers=new TreeSet<>(Arrays.asList(1,3,5));
        numbers.remove(3);
        System.out.println(numbers.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
    }
}
