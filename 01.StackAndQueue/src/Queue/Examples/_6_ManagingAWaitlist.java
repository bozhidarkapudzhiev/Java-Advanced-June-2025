package Queue.Examples;

import java.util.ArrayDeque;

public class _6_ManagingAWaitlist {
    public static void main(String[] args) {
        ArrayDeque<String>waitingList=new ArrayDeque<>();
        waitingList.offer("Client 1: John");
        waitingList.offer("Client 2: Sara");
        waitingList.offer("Client 3: David");

        System.out.println("Serving clients from the waitlist: ");
        while (!waitingList.isEmpty()){
            String currentClient=waitingList.poll();
            System.out.println("Now serving: "+currentClient );
        }
    }
}
