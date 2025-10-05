package _01_Sets.LinkedHashMap.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _3_Iteration {
    public static void main(String[] args) {
        Set<String>sets=new LinkedHashSet<>(Arrays.asList("Alpha", "Beta", "Gamma"));
        String result=String.valueOf(sets)
                .replaceAll("\\[","")
                .replaceAll("\\]","");

        System.out.println(result);
    }
}
