package Queue.Examples;

import java.util.ArrayDeque;

public class _2_PrinterQueueSimulation {
    public static void main(String[] args) {
        ArrayDeque<String>printJobs=new ArrayDeque<>();
        printJobs.offer("Document A");
        printJobs.offer("Image B");
        printJobs.offer("Report C");
        System.out.println("Printing documents in order:");
        while (!printJobs.isEmpty()){
            String currentJobs=printJobs.poll();
            System.out.println("Printing: "+currentJobs);
        }
    }
}
