package Stack.Task;

import java.util.*;

public class _5_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackInteger = new ArrayDeque<>();
        int[] arraysInteger = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(arraysInteger).forEach(stackInteger::push);
        int minValues = insertMinValue(stackInteger);
        System.out.println(minValues);

    }

    private static int insertMinValue(ArrayDeque<Integer> stackInteger) {
        int minValues=Integer.MAX_VALUE;
        for (int current: stackInteger){
            if (current<minValues){
                minValues=current;
            }
        }
        return minValues;
    }
}
