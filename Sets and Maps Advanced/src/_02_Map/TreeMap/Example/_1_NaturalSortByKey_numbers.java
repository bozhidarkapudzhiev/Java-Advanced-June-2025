package _02_Map.TreeMap.Example;

import java.util.Map;
import java.util.TreeMap;

public class _1_NaturalSortByKey_numbers {
    public static void main(String[] args) {
        Map<Integer,String>users=new TreeMap<>();
        users.put(500,"Gosho");
        users.put(100,"Ivan");
        users.put(300,"Maria");
        //Обхождане : Ключовете са сортирани (100, 300, 500)
        for (Map.Entry<Integer,String>entry:users.entrySet()){
            System.out.println("ID "+entry.getKey()+" : "+entry.getValue());
        }
    }
}
