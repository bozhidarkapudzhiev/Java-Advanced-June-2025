package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _10_ConvertToAnArray {
    public static void main(String[] args) {
        Set<String> animalsSet = new HashSet<>(Arrays.asList("Cat", "Dog"));
        String[] animalsArrays = new String[animalsSet.size()];
        copySetToArrays(animalsSet, animalsArrays);
        System.out.println(animalsArrays.length);
    }

    private static void copySetToArrays(Set<String> animalsSet, String[] animalsArrays) {
        int count=0;
        for (String current : animalsSet) {
          animalsArrays[count]=current;
          count++;
        }
    }
}
