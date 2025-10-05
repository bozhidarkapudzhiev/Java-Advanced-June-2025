package _01_Sets.HashSet.Task;
import java.util.*;
public class _1_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer>scanLine= Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().toList();
        Set<Integer> numbers = new HashSet<>(scanLine);
        numbers.forEach(e->System.out.printf("%d ",e));
        System.out.println();
    }
}
