package _02_Map.TreeMap.Example;

import java.util.Map;
import java.util.TreeMap;

public class _5_ElevationOfSubsetOfKeys_subMap {
    public static void main(String[] args) {
        TreeMap<Integer,String>score=new TreeMap<>();
        score.put(10,"A");
        score.put(20,"B");
        score.put(30,"C");
        score.put(40,"D");

        //subMap (20,40) - Включва 20,Изключва 40
        Map<Integer,String>subMap=score.subMap(20,40);

        //Обхождане на подмножеството
        for (Integer key:subMap.keySet()){
            System.out.println("Sub Key: "+key);//Изход: 20,30
        }
    }
}
