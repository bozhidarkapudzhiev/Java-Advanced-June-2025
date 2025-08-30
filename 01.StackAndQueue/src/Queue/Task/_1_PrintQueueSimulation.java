package Queue.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_PrintQueueSimulation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String>queuePrinter=new ArrayDeque<>();
        String input;
        while (!"End".equals(input=scanner.nextLine())){
            queuePrinter.offer(input);
        }
        while (!queuePrinter.isEmpty()){
            System.out.println("Printing: " + queuePrinter.poll());
        }
    }
}
