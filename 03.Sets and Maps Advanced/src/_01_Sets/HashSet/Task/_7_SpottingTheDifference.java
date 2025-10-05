package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _7_SpottingTheDifference {
    public static void main(String[] args) {
        //Входни данни
        Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(20, 40, 50));
        //1.Създаваме копие на Set A (за да не променяме оригинала)
        Set<Integer> difference = new HashSet<>(set1);
        //2.Използваме  TODO: removeAll()
        //Премахва от difference всички елементи , които се съдържат в 'setB'
        difference.removeAll(set2);
        System.out.println(String.valueOf(difference).replaceAll("\\[","").replace("]",""));
    }
}
