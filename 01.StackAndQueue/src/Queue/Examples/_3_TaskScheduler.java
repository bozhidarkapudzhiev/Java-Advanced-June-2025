package Queue.Examples;

import java.util.ArrayDeque;

public class _3_TaskScheduler {
    public static void main(String[] args) {
        ArrayDeque<String>task=new ArrayDeque<>();
        task.offer("Task 1: Read email");
        task.offer("Task 2: Finish report");
        task.offer("Task 3: Call client");

        System.out.println("Executing tasks:");
        while (!task.isEmpty()){
            String currentTask=task.poll();
            System.out.println("Executing: "+currentTask);
        }
    }
}
