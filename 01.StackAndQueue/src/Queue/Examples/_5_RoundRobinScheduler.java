package Queue.Examples;

import java.util.ArrayDeque;

public class _5_RoundRobinScheduler {
    public static void main(String[] args) {
        ArrayDeque<String>tasks=new ArrayDeque<>();
        tasks.offer("Process A");
        tasks.offer("Process B");
        tasks.offer("Process C");

        int timeQuantum=2;//Време за изпълнение на един процес

        while (!tasks.isEmpty()){
            String currentTask=tasks.poll();
            System.out.println("Executing "+ currentTask+ " for "+ timeQuantum+" seconds.");

            //След известно врем , процеът се връща в края на опашката
            if (!currentTask.equals("Process C")){//Просто за пример
                tasks.offer(currentTask);
        }
    }
}
}
