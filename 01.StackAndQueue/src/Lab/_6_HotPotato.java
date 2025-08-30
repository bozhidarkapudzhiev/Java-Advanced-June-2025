package Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class _6_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] arrString = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        Arrays.stream(arrString).forEach(queue::offer);
        rotationNames(queue, n);
        System.out.printf("Last is %s%n",queue.poll());
    }

    private static void rotationNames(ArrayDeque<String> queue, int n) {
        int count = 1;
        while (queue.size()>1)
        for (int i = count; i <= n; i++) {
            if (count== n) {
                System.out.printf("Removed %s%n", queue.poll());
                count=1;
            } else {
                String currentName = queue.poll();
                if (currentName != null) {
                    queue.offer(currentName);
                    count++;
                }

            }
        }
    }
}
