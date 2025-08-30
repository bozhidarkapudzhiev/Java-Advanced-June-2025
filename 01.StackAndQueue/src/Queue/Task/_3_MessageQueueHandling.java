package Queue.Task;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _3_MessageQueueHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split("\\s+");
        ArrayDeque<String>stringArrayDeque=new ArrayDeque<>();
        Arrays.stream(input).forEach(stringArrayDeque::offer);
        while (!stringArrayDeque.isEmpty()){
            System.out.println("Received: ".concat(stringArrayDeque.poll()));
        }
    }
}
