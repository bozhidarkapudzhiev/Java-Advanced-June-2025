package _01_Sets.HashSet.Task;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class _3_Conjunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Integer>set1= readerSets(scanner);
        Set<Integer>set2= readerSets(scanner);

        set1.addAll(set2);
        set1.forEach(e->System.out.printf("%d ",e));
        System.out.println();
    }

    private static Set<Integer> readerSets(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toSet());
    }
    //Set A: {1, 2, 3},
    //Set B: {3, 4, 5}
}
