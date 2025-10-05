package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _9__MapSize {
    public static void main(String[] args) {
        Map<String,Integer>inventory=new HashMap<>();
        inventory.put("Milk",5);
        inventory.put("Bread",3);
        System.out.println("Брой уникални продукти: " + inventory.size());
    }
}
