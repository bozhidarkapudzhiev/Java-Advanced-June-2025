package _01_Sets.TreeSet.Task;

import java.util.*;

public class _4_FindTheLastLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        int[] arr = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(arr).forEach(set::add);
        Optional<Integer> maxValue = set.stream().max(Integer::compareTo);
        System.out.println(maxValue.get());
    }
}
