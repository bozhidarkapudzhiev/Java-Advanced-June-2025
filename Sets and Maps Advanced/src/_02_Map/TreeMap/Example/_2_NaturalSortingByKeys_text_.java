package _02_Map.TreeMap.Example;

import java.util.Map;
import java.util.TreeMap;

public class _2_NaturalSortingByKeys_text_ {
    public static void main(String[] args) {
        Map<String,Integer>words=new TreeMap<>();
        words.put("Banana",1);
        words.put("Apple",3);
        words.put("Grape",2);

        //Обхождане: Ключове са сортирани азбучно
        for (String word:words.keySet()){
            System.out.println(word);//Изход : Apple, Banana,Grape
        }
    }
}
