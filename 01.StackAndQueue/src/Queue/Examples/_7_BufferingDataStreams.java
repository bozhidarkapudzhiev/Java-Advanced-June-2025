package Queue.Examples;

import java.util.ArrayDeque;

public class _7_BufferingDataStreams {
    public static void main(String[] args) {
        ArrayDeque<byte[]>dataPackets=new ArrayDeque<>();
        //Симулиране на пристигащи пакати
        dataPackets.offer(new byte[]{1,2,3});
        dataPackets.offer(new byte[]{4,5,6});
        dataPackets.offer(new byte[]{7,8,9});

        System.out.println("Processing data packets:");
        while (!dataPackets.isEmpty()){
            byte[]packet=dataPackets.poll();
            System.out.println("Processing packet with first byte: "+packet[0]);
        }
    }
}
