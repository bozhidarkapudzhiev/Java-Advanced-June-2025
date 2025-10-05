package _01_Sets.HashSet.Example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _9_MergingTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer>set2=new HashSet<>(Arrays.asList(3,4,5));
        set1.addAll(set2);//set1 става обединението
        set1.forEach(element->System.out.printf("%d ",element));//Изход: 1 2 3 4 5
    }
}
