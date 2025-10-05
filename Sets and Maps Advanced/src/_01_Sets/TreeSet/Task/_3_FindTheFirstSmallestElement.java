package _01_Sets.TreeSet.Task;

import java.util.*;
import java.util.stream.Collectors;

public class _3_FindTheFirstSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new TreeSet<>(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
        Optional<Integer> minValue = set.stream().min(Integer::compareTo);
        System.out.println(minValue.get());
    }
}
