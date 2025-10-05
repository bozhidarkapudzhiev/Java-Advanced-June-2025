package _02_Map.LinkedHashMap.Example;

import java.util.LinkedHashMap;
import java.util.Map;

public class _3_TraversingKeysInOrderOfAddition {
    public static void main(String[] args) {
        Map<String,String>planets=new LinkedHashMap<>();
        planets.put("Mars","Red");
        planets.put("Earth","Blue");
        for (String planet:planets.keySet()){
            System.out.println(planet);//Изход :Mars, Earth
        }
    }
}
