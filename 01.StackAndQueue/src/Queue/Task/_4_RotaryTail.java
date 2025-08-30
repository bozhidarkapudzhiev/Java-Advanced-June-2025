package Queue.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_RotaryTail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> rotateNames = new ArrayDeque<>();
        String input = scanner.nextLine();
        int rotation = 0;
        while (true) {

            if (!Character.isDigit(input.charAt(0))) {
                rotateNames.offer(input);
                input = scanner.nextLine();
            } else {
                rotation = Integer.parseInt(input);
                break;
            }
        }

        while (rotation-- > 0) {
            String currentName = rotateNames.poll();
            System.out.printf("%s is moved to the end of the queue.%n", currentName);
            if (currentName!=null){
                rotateNames.offer(currentName);
            }

        }

        System.out.println();

    }
}
