package Queue.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _6_HotPotatoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> names = new ArrayDeque<>();
        String input;
        while (true) {
            input = scanner.nextLine();
            if (!input.matches("\\d+")) {
                names.offer(input);
            } else {
                break;
            }
        }
        int rotation = Integer.parseInt(input);
        while (rotation> 0) {
            String currentName = names.poll();
            names.offer(currentName);
            System.out.printf("%s is moved to the end of the queue.\n", currentName);
           rotation--;
        }
        System.out.println();
    }
}
