package _02_Map.TreeMap.Example;

import java.util.TreeMap;

public class _4_ExtractTheSmallestAndLargestKey {
    public static void main(String[] args) {
        TreeMap<Integer,String> data=new TreeMap<>();
        data.put(10,"X");
        data.put(5,"Y");
        data.put(7,"Z");
        System.out.println("Най-малък ключ (firstKey): " + data.firstKey());//Изход: 5
        System.out.println("Най-голям ключ (lastKey): " + data.lastKey());//Изход: 10
    }
}
