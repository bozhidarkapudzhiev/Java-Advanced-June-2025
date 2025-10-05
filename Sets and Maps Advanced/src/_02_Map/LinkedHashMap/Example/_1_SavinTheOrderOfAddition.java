package _02_Map.LinkedHashMap.Example;

import java.util.LinkedHashMap;
import java.util.Map;

public class _1_SavinTheOrderOfAddition {
    public static void main(String[] args) {
        Map<Integer,String>codes=new LinkedHashMap<>();
        codes.put(1,"One");
        codes.put(3,"Three");
        codes.put(2,"Two");

        //Обхождане : Редът е гарантиран (1,3,2)
        for (Map.Entry<Integer,String>entry: codes.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
