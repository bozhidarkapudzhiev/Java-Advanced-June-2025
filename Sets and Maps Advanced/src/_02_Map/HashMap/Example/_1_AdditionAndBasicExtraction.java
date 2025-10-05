package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _1_AdditionAndBasicExtraction {
    public static void main(String[] args) {
        Map<String,Integer>fruitPrices=new HashMap<>();
        fruitPrices.put("Apple",2);
        fruitPrices.put("Banana",1);
        fruitPrices.put("Orange",3);

        //Извличане на стойност по ключ
        int price=fruitPrices.get("Apple");
        System.out.println("Цената на Apple е: "+price);

        //Обхождане на Map-а (Редът е случаен)
        for (Map.Entry<String,Integer>entry:fruitPrices.entrySet()){
            System.out.println(entry.getKey()+ " -> "+entry.getValue());
        }
    }
}
