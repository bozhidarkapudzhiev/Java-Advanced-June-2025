package _02_Map.TreeMap.Example;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _3_ReverseSort_CustomComparator {
    public static void main(String[] args) {
        //TreeMap, сортиран в обратен ред
        Map<Integer,String>reversedMap=new TreeMap<>(Comparator.reverseOrder());
        reversedMap.put(1,"A");
        reversedMap.put(5,"E");

        //Обхождане: Сортиране в низходящ ред:
        for (Integer key:reversedMap.keySet()){
            System.out.println(key);//Изход: 5, 1
        }
    }
}
