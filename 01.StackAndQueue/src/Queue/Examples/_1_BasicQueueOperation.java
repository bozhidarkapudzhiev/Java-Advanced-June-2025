package Queue.Examples;

import java.util.ArrayDeque;

public class _1_BasicQueueOperation {
    public static void main(String[] args) {
          ArrayDeque<String>names=new ArrayDeque<>();
          //Добавяне на елементи в края на опашката
        //offer() - Добавяне на елемент в края на опашката.
        names.offer("Maria");
        names.offer("Peter");
        names.offer("Georgi");
        System.out.println("Queue: " + names);//Queue: [Maria,Peter,Georgi]

        //Преглед на първия елемент без да го премахваме.
        //peek() - Връща елемента от началото на опашката , без да го премахва .
        System.out.println(names.peek());//First element : Maria

        //Премахване на първия елемент
        //poll() - Премахване и връща елемент от началото на опашката
        System.out.println("Remove element: "+names.poll());//Remove element: Maria

        System.out.println("Queue after poll: "+
                names.toString()
                        .replaceAll("\\[","")
                        .replaceAll("\\]",""));

    }
}
