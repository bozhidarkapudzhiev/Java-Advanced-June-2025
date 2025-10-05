package _02_Map.LinkedHashMap.Example;

import java.util.LinkedHashMap;
import java.util.Map;

public class _2_UpdateValuesAndKeepOrder {
    public static void main(String[] args) {
        Map<String, Integer> stock = new LinkedHashMap<>();
        stock.put("A", 10);
        stock.put("B", 20);
        stock.put("A", 15);//Актуализация
        //Обхождане :"B" следва "А" ,въпреки, че "A" е актуализиран
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Изход:
        // A 15
        // B 20
    }
}
