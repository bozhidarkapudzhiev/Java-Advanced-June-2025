package Queue.Task;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_BankQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String>names=new ArrayDeque<>();
        String name;
        while (!"End".equals(name=scanner.nextLine())){
            names.offer(name);
        }
        while (!names.isEmpty()){
            System.out.println("Serving: "+names.poll());
        }
    }
}
