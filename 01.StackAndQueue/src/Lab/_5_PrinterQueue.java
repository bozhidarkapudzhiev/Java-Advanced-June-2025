package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String input=scanner.nextLine();
        String message="";
        while(true){
            if ("print".equals(input)){
                break;
            }
            if ("cancel".equals(input)){
                if (!queue.isEmpty()){
                  message="Canceled "+queue.poll();
                }else {
                    message="Printer is on standby";
                }
                System.out.println(message);
            }else {
                queue.offer(input);
            }
            input=scanner.nextLine();

        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
